/*
 * XmlReader.java
 *
 * Copyright (C) 2008-2012 O. Givi (info@dirsyncpro.org)
 * Copyright (C) 2002, 2003, 2005, 2006, 2008 F. Gerbig (fgerbig@users.sourceforge.net)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.wright.dirsyncpro.xml;

import edu.wright.dirsyncpro.Const;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.Filter;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByDate;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByFileAttribute;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByFileOwnership;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByFilePermissions;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByFileSize;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByPath;
import edu.wright.dirsyncpro.gui.jobdialog.filtertree.filter.FilterByPattern;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.schedule.Schedule;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.schedule.ScheduleDaily;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.schedule.ScheduleHourly;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.schedule.ScheduleMinutely;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.schedule.ScheduleMonthly;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.schedule.ScheduleOnce;
import edu.wright.dirsyncpro.gui.jobdialog.scheduletree.schedule.ScheduleWeekly;
import edu.wright.dirsyncpro.job.Job;
import edu.wright.dirsyncpro.sync.Sync;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads a XML config file. The data can be retrieved via the various getter methods.
 *
 * @author F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public class XmlReader extends DefaultHandler {

    private String logFileName;
    private List<Job> jobs = new ArrayList<>();

    /**
     * Reads data from the given XML file. The data can be retreived via the various getter methods.
     *
     * @param filename The filename of the XML fil to read the data from.
     *
     * @throws Exception
     */
    public XmlReader(String filename) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();

        factory.setNamespaceAware(false);
        factory.setValidating(true);

        SAXParser parser = factory.newSAXParser();
        parser.parse(new FileInputStream(filename), this);
    }

    /**
     * SAX method called for every XML element start.
     *
     * @param namespaceURI The namespace of this XML element (if the parser is namespace aware).
     * @param localname    The localname of this XML element (if the parser is namespace aware).
     * @param qName        The name of this XML element (if the parser is NOT namespace aware).
     * @param atts         The XML elements attributes.
     *
     * @throws SAXException
     */
    @Override
    public void startElement(String namespaceURI, String localname,
                             String qName, Attributes atts) throws SAXException {

        String att;
        Job job = new Job(false); //dummy

        if (qName.equals(Xml.TAG_ROOT)) {

            // make a temporary sync object to obtain the initial defaults
            Sync s = new Sync();

            att = (atts.getValue(Xml.ATTR_LOGFILE) != null) ? atts.getValue(Xml.ATTR_LOGFILE) : "";
            logFileName = att;

            return;
        }

        if (qName.equals(Xml.TAG_JOB)) {
            try {
                job = new Job(true);
                //clear filters as we are loading new ones.
                job.resetFilters();
            } catch (Exception e) {
                throw new Error(e);
            }

            // FIXME: the default values should come from Const object
            att = (atts.getValue(Xml.ATTR_NAME) != null) ? atts.getValue(Xml.ATTR_NAME) : "";
            job.setName(att);

            att = (atts.getValue(Xml.ATTR_ENABLED) != null) ? atts.getValue(Xml.ATTR_ENABLED) : "true";
            job.setEnabled(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_SRC) != null) ? atts.getValue(Xml.ATTR_SRC) : "";
            job.setSrc(att);

            att = (atts.getValue(Xml.ATTR_DST) != null) ? atts.getValue(Xml.ATTR_DST) : "";
            job.setDst(att);

            Const.SyncMode sm = (atts.getValue(Xml.ATTR_SYNC_MODE) != null) ? Const.SyncMode.valueOf(atts.getValue(Xml.ATTR_SYNC_MODE)) : Const.SyncMode.ABMirror;
            job.setSyncMode(sm);

            att = (atts.getValue(Xml.ATTR_WITHSUBFOLDERS) != null) ? atts.getValue(Xml.ATTR_WITHSUBFOLDERS) : "false";
            job.setRecursive(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_VERIFY) != null) ? atts.getValue(Xml.ATTR_VERIFY) : "false";
            job.setVerify(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_REALTIME) != null) ? atts.getValue(Xml.ATTR_REALTIME) : "false";
            job.setSyncRealtime(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_REALTIME_SYNC_ON_START) != null) ? atts.getValue(Xml.ATTR_REALTIME_SYNC_ON_START) : "true";
            job.setSyncRealtimeOnStart(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_REALTIME_DELAY) != null) ? atts.getValue(Xml.ATTR_REALTIME_DELAY) : Const.DefaultRealtimeSyncDelayValue + "";
            job.setSyncRealtimeDelay(Integer.valueOf(att));

            att = (atts.getValue(Xml.ATTR_LOGFILE) != null) ? atts.getValue(Xml.ATTR_LOGFILE) : "";
            job.getLog().setFile(att);

            att = (atts.getValue(Xml.ATTR_SYNC_NEW) != null) ? atts.getValue(Xml.ATTR_SYNC_NEW) : "false";
            job.setCopyNew(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_SYNC_MODIFIED) != null) ? atts.getValue(Xml.ATTR_SYNC_MODIFIED) : "false";
            job.setCopyModified(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_SYNC_LARGER) != null) ? atts.getValue(Xml.ATTR_SYNC_LARGER) : "false";
            job.setCopyLarger(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_SYNC_LARGERMODIFIED) != null) ? atts.getValue(Xml.ATTR_SYNC_LARGERMODIFIED) : "false";
            job.setCopyLargerModified(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_SYNC_CMP_MODE) != null)
                    ? atts.getValue(Xml.ATTR_SYNC_CMP_MODE) : Const.COMPARE_MODE_DEFAULT.toString();
            job.setSyncCompareMode(Const.CompareMode.valueOf(att));

            att = (atts.getValue(Xml.ATTR_SYNC_ALL) != null) ? atts.getValue(Xml.ATTR_SYNC_ALL) : "false";
            job.setCopyAll(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_DEL_FILES) != null) ? atts.getValue(Xml.ATTR_DEL_FILES) : "false";
            job.setDelFiles(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_DEL_DIRS) != null) ? atts.getValue(Xml.ATTR_DEL_DIRS) : "false";
            job.setDelDirs(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_DEL_EXCLUDED_FILES_A) != null) ? atts.getValue(Xml.ATTR_DEL_EXCLUDED_FILES_A) : "false";
            job.setDeleteExcludedFilesA(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_DEL_EXCLUDED_DIRS_A) != null) ? atts.getValue(Xml.ATTR_DEL_EXCLUDED_DIRS_A) : "false";
            job.setDeleteExcludedDirsA(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_DEL_EXCLUDED_FILES_B) != null) ? atts.getValue(Xml.ATTR_DEL_EXCLUDED_FILES_B) : "false";
            job.setDeleteExcludedFilesB(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_DEL_EXCLUDED_DIRS_B) != null) ? atts.getValue(Xml.ATTR_DEL_EXCLUDED_DIRS_B) : "false";
            job.setDeleteExcludedDirsB(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_SYNC_CONFLICT_RESOLUTION_MODE) != null)
                    ? atts.getValue(Xml.ATTR_SYNC_CONFLICT_RESOLUTION_MODE)
                    : // BI or mono here?
                    (job.getSyncMode().isBI() ? Const.BIDIR_SYNC_CONFLICT_RESOLUTION_MODE_DEFAULT.toString() : Const.MONODIR_SYNC_CONFLICT_RESOLUTION_MODE_DEFAULT.toString());
            job.setSyncConflictResolutionMode(Const.SyncConflictResolutionMode.valueOf(att));

            att = (atts.getValue(Xml.ATTR_BACKUPS) != null) ? atts.getValue(Xml.ATTR_BACKUPS) : "0";
            job.setHowManyBackups(Integer.valueOf(att));

            att = (atts.getValue(Xml.ATTR_BACKUPINLINE) != null) ? atts.getValue(Xml.ATTR_BACKUPINLINE) : "true";
            job.setBackupInline(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_BACKUPDIR) != null) ? atts.getValue(Xml.ATTR_BACKUPDIR) : "";
            job.setBackupDir(att);

            Const.SymLinkMode slm = (atts.getValue(Xml.ATTR_SYM_LINK_MODE) != null) ? Const.SymLinkMode.valueOf(atts.getValue(Xml.ATTR_SYM_LINK_MODE)) : Const.SymLinkMode.SkipSymLinks;
            job.setSymLinkMode(slm);

            att = (atts.getValue(Xml.ATTR_PRESERVE_DOS_ATTRIBUTES) != null) ? atts.getValue(Xml.ATTR_PRESERVE_DOS_ATTRIBUTES) : "false";
            job.setPreserveDOSAttributes(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_PRESERVE_POSIX_FILE_PERMISSIONS) != null) ? atts.getValue(Xml.ATTR_PRESERVE_POSIX_FILE_PERMISSIONS) : "false";
            job.setPreservePOSIXFilePermissions(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_PRESERVE_POSIX_FILE_OWNERSHIP) != null) ? atts.getValue(Xml.ATTR_PRESERVE_POSIX_FILE_OWNERSHIP) : "false";
            job.setPreservePOSIXFileOwnership(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_OVERRIDE_READ_ONLY) != null) ? atts.getValue(Xml.ATTR_OVERRIDE_READ_ONLY) : "false";
            job.setOverrideReadOnly(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_TIMESTAMPWRITEBACK) != null) ? atts.getValue(Xml.ATTR_TIMESTAMPWRITEBACK) : "false";
            job.setWriteTimestampBack(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_IGNOREDAYLIGHTSAVINGGRANULARIY) != null) ? atts.getValue(Xml.ATTR_IGNOREDAYLIGHTSAVINGGRANULARIY) : "false";
            job.setIgnoreDaylightSavingGranularity(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_DIRSYNCTIMESTAMP) != null) ? atts.getValue(Xml.ATTR_DIRSYNCTIMESTAMP) : "false";
            job.setSyncDirTimeStamps(Boolean.valueOf(att));

            att = (atts.getValue(Xml.ATTR_TIMESTAMPDIFF) != null) ? atts.getValue(Xml.ATTR_TIMESTAMPDIFF) : "0";
            job.setGranularity(Integer.decode(att));

            jobs.add(job);
        }

        if (qName.equals(Xml.TAG_SCHEDULE)) {
            Schedule sched = null;
            // Get the last loaded job
            job = jobs.get(jobs.size() - 1);
            att = atts.getValue(Xml.ATTR_SCHEDULE_TYPE);
            if (att.equals(Schedule.Type.Once.toString())) {
                sched = new ScheduleOnce(job);
                try {
                    sched.setTimeFrameFrom((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM)) : Const.NonDate);
                    sched.setTimeFrameTo((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO)) : Const.NonDate);
                    ((ScheduleOnce) sched).setDate((atts.getValue(Xml.ATTR_SCHEDULE_DATE) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_DATE)) : Const.NonDate);
                } catch (ParseException e) {
                }
            } else if (att.equals(Schedule.Type.Minutely.toString())) {
                sched = new ScheduleMinutely(job);
                try {
                    sched.setTimeFrameFrom((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM)) : Const.NonDate);
                    sched.setTimeFrameTo((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO)) : Const.NonDate);
                    ((ScheduleMinutely) sched).setInterval(atts.getValue(Xml.ATTR_SCHEDULE_INTERVAL) != null ? Integer.decode(atts.getValue(Xml.ATTR_SCHEDULE_INTERVAL)) : 1);
                } catch (ParseException e) {
                }
            } else if (att.equals(Schedule.Type.Hourly.toString())) {
                sched = new ScheduleHourly(job);
                try {
                    sched.setTimeFrameFrom((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM)) : Const.NonDate);
                    sched.setTimeFrameTo((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO)) : Const.NonDate);
                    ((ScheduleHourly) sched).setInterval(atts.getValue(Xml.ATTR_SCHEDULE_INTERVAL) != null ? Integer.decode(atts.getValue(Xml.ATTR_SCHEDULE_INTERVAL)) : 1);
                } catch (ParseException e) {
                }
            } else if (att.equals(Schedule.Type.Daily.toString())) {
                sched = new ScheduleDaily(job);
                try {
                    sched.setTimeFrameFrom((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM)) : Const.NonDate);
                    sched.setTimeFrameTo((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO)) : Const.NonDate);
                    ((ScheduleDaily) sched).setInterval(atts.getValue(Xml.ATTR_SCHEDULE_INTERVAL) != null ? Integer.decode(atts.getValue(Xml.ATTR_SCHEDULE_INTERVAL)) : 1);
                    ((ScheduleDaily) sched).setTime((atts.getValue(Xml.ATTR_SCHEDULE_TIME) != null) ? (new SimpleDateFormat(Const.DefaultTimeFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIME)) : Const.NonDate);
                } catch (ParseException e) {
                }
            } else if (att.equals(Schedule.Type.Weekly.toString())) {
                sched = new ScheduleWeekly(job);
                try {
                    sched.setTimeFrameFrom((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM)) : Const.NonDate);
                    sched.setTimeFrameTo((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO)) : Const.NonDate);
                    ((ScheduleWeekly) sched).setInterval(atts.getValue(Xml.ATTR_SCHEDULE_INTERVAL) != null ? Integer.decode(atts.getValue(Xml.ATTR_SCHEDULE_INTERVAL)) : 1);
                    ((ScheduleWeekly) sched).setTime((atts.getValue(Xml.ATTR_SCHEDULE_TIME) != null) ? (new SimpleDateFormat(Const.DefaultTimeFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIME)) : Const.NonDate);
                    ((ScheduleWeekly) sched).setSunday((atts.getValue(Xml.ATTR_SCHEDULE_SUNDAY) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_SUNDAY)));
                    ((ScheduleWeekly) sched).setMonday(atts.getValue(Xml.ATTR_SCHEDULE_MONDAY) == null || Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_MONDAY)));
                    ((ScheduleWeekly) sched).setTuesday((atts.getValue(Xml.ATTR_SCHEDULE_TUESDAY) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_TUESDAY)));
                    ((ScheduleWeekly) sched).setWednesday((atts.getValue(Xml.ATTR_SCHEDULE_WEDNESDAY) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_WEDNESDAY)));
                    ((ScheduleWeekly) sched).setThursday((atts.getValue(Xml.ATTR_SCHEDULE_THURSDAY) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_THURSDAY)));
                    ((ScheduleWeekly) sched).setFriday((atts.getValue(Xml.ATTR_SCHEDULE_FRIDAY) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_FRIDAY)));
                    ((ScheduleWeekly) sched).setSaturday((atts.getValue(Xml.ATTR_SCHEDULE_SATURDAY) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_SATURDAY)));
                } catch (ParseException e) {
                }
            } else if (att.equals(Schedule.Type.Monthly.toString())) {
                sched = new ScheduleMonthly(job);
                try {
                    sched.setTimeFrameFrom((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_FROM)) : Const.NonDate);
                    sched.setTimeFrameTo((atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO) != null) ? (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIMEFRAME_TO)) : Const.NonDate);
                    ((ScheduleMonthly) sched).setDay(atts.getValue(Xml.ATTR_SCHEDULE_DAY) != null ? Integer.decode(atts.getValue(Xml.ATTR_SCHEDULE_DAY)) : 1);
                    ((ScheduleMonthly) sched).setTime((atts.getValue(Xml.ATTR_SCHEDULE_TIME) != null) ? (new SimpleDateFormat(Const.DefaultTimeFormat)).parse(atts.getValue(Xml.ATTR_SCHEDULE_TIME)) : Const.NonDate);
                    ((ScheduleMonthly) sched).setJanuary(atts.getValue(Xml.ATTR_SCHEDULE_JANUARY) == null || Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_JANUARY)));
                    ((ScheduleMonthly) sched).setFebruary((atts.getValue(Xml.ATTR_SCHEDULE_FEBRUARY) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_FEBRUARY)));
                    ((ScheduleMonthly) sched).setMarch((atts.getValue(Xml.ATTR_SCHEDULE_MARCH) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_MARCH)));
                    ((ScheduleMonthly) sched).setApril((atts.getValue(Xml.ATTR_SCHEDULE_APRIL) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_APRIL)));
                    ((ScheduleMonthly) sched).setMay((atts.getValue(Xml.ATTR_SCHEDULE_MAY) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_MAY)));
                    ((ScheduleMonthly) sched).setJune((atts.getValue(Xml.ATTR_SCHEDULE_JUNE) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_JUNE)));
                    ((ScheduleMonthly) sched).setJuly((atts.getValue(Xml.ATTR_SCHEDULE_JULY) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_JULY)));
                    ((ScheduleMonthly) sched).setAugust((atts.getValue(Xml.ATTR_SCHEDULE_AUGUST) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_AUGUST)));
                    ((ScheduleMonthly) sched).setSeptember((atts.getValue(Xml.ATTR_SCHEDULE_SEPTEMBER) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_SEPTEMBER)));
                    ((ScheduleMonthly) sched).setOctober((atts.getValue(Xml.ATTR_SCHEDULE_OCTOBER) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_OCTOBER)));
                    ((ScheduleMonthly) sched).setNovember((atts.getValue(Xml.ATTR_SCHEDULE_NOVEMBER) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_NOVEMBER)));
                    ((ScheduleMonthly) sched).setDecember((atts.getValue(Xml.ATTR_SCHEDULE_DECEMBER) != null) && Boolean.valueOf(atts.getValue(Xml.ATTR_SCHEDULE_DECEMBER)));
                } catch (ParseException e) {
                }
            }
            if (sched != null) {
                job.addSchedule(sched);
            }
        }
        if (qName.equals(Xml.TAG_FILTER)) {
            Filter filt = null;
            // Get the last loaded job
            job = jobs.get(jobs.size() - 1);
            att = atts.getValue(Xml.ATTR_FILTER_TYPE);
            Filter.Action ac = Filter.Action.valueOf(atts.getValue(Xml.ATTR_FILTER_ACTION));
            if (att.equals(Filter.Type.ByPattern.toString())) {
                filt = new FilterByPattern(job, ac, atts.getValue(Xml.ATTR_FILTER_PATTERN_PATTERN_STR), FilterByPattern.FilterPatternType.valueOf(atts.getValue(Xml.ATTR_FILTER_PATTERN_PATTERN_TYPE)), Boolean.valueOf(atts.getValue(Xml.ATTR_FILTER_PATTERN_REGEXP)));
            } else if (att.equals(Filter.Type.ByDate.toString())) {
                att = (atts.getValue(Xml.ATTR_FILTER_DATE_MODE) != null)
                        ? atts.getValue(Xml.ATTR_FILTER_DATE_MODE) : FilterByDate.FilterDateMode.SpecificTime.toString();
                if (att.equals(FilterByDate.FilterDateMode.SpecificTime.toString())) {
                    try {
                        filt = new FilterByDate(job, ac, (new SimpleDateFormat(Const.DefaultDateFormat)).parse(atts.getValue(Xml.ATTR_FILTER_DATE)), FilterByDate.FilterDateType.valueOf(atts.getValue(Xml.ATTR_FILTER_DATE_TYPE)));
                    } catch (ParseException e) {
                    }
                }
                if (att.equals(FilterByDate.FilterDateMode.TimeUnit.toString())) {
                    try {
                        filt = new FilterByDate(job, ac, Integer.parseInt(atts.getValue(Xml.ATTR_FILTER_TIME_UNIT_VALUE)), FilterByDate.FilterTimeUnitType.valueOf(atts.getValue(Xml.ATTR_FILTER_TIME_UNIT)), FilterByDate.FilterDateType.valueOf(atts.getValue(Xml.ATTR_FILTER_DATE_TYPE)));
                    } catch (NumberFormatException e) {
                    }
                }
            } else if (att.equals(Filter.Type.ByPath.toString())) {
                filt = new FilterByPath(job, ac, atts.getValue(Xml.ATTR_FILTER_PATH));
            } else if (att.equals(Filter.Type.ByFileSize.toString())) {
                filt = new FilterByFileSize(job, ac, Long.valueOf(atts.getValue(Xml.ATTR_FILTER_FILE_SIZE_VALUE)), FilterByFileSize.FilterFileSizeType.valueOf(atts.getValue(Xml.ATTR_FILTER_FILE_SIZE_TYPE)));
            } else if (att.equals(Filter.Type.ByFilePermissions.toString())) {
                filt = new FilterByFilePermissions(job, ac, atts.getValue(Xml.ATTR_FILTER_FILE_PERMISSION));
            } else if (att.equals(Filter.Type.ByFileOwnership.toString())) {
                filt = new FilterByFileOwnership(job, ac, atts.getValue(Xml.ATTR_FILTER_FILE_OWNERSHIP_OWNER), atts.getValue(Xml.ATTR_FILTER_FILE_OWNERSHIP_GROUP));
            } else if (att.equals(Filter.Type.ByDOSAttributes.toString())) {
                filt = new FilterByFileAttribute(job, ac, Boolean.valueOf(atts.getValue(Xml.ATTR_FILTER_DOS_ATTRIBUTE_READ_ONLY)), Boolean.valueOf(atts.getValue(Xml.ATTR_FILTER_DOS_ATTRIBUTE_HIDDEN)), Boolean.valueOf(atts.getValue(Xml.ATTR_FILTER_DOS_ATTRIBUTE_SYSTEM)), Boolean.valueOf(atts.getValue(Xml.ATTR_FILTER_DOS_ATTRIBUTE_ARCHIVE)));
            }

            if (filt != null && job.getSyncMode().isCustom()) {
                job.getFilterSet().addFilter(filt);
            }
        }
    }

    /**
     * Returns a {@code List} of {@code Directory}s to dirsyncpro.
     *
     * @return List The {@code Directory}s to dirsyncpro.
     */
    public List<Job> getJobs() {
        return jobs;
    }

    /**
     * Returns the file where to log what's being done.
     *
     * @return The logfile.
     */
    public String getLogFileName() {
        return logFileName;
    }
}
