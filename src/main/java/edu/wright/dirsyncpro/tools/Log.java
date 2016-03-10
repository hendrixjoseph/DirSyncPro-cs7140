/*
 * Log.java
 *
 * Copyright (C) 2008-2011 O. Givi (info@dirsyncpro.org)
 * Copyright (C) 2003, 2005-2008 F. Gerbig
 * Copyright (C) 2002 E. Gerber
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
package edu.wright.dirsyncpro.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import edu.wright.dirsyncpro.Const;
import edu.wright.dirsyncpro.Const.IconKey;
import edu.wright.dirsyncpro.Const.LogLevel;
import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.exceptions.IncompleteConfigurationException;
import edu.wright.dirsyncpro.job.Job;
import edu.wright.dirsyncpro.message.Message;
import edu.wright.dirsyncpro.message.MessageQ;
import java.io.FileNotFoundException;

/**
 * Represents a log file. Contains methods to create or continue a log file.
 *
 * @author E. Gerber , F. Gerbig, O. Givi (info@dirsyncpro.org)
 */
public class Log {

    // arrays to store log items
    private MessageQ messages = new MessageQ();
    private boolean messageQUpdated = false;

    private File file = null;
    private String wildCardedFileName = "";
    private Job job = null;

    private Writer out;

    /**
     * Prints an error message to the log.
     *
     * @param message The error message.
     */
    private void printError(String message) {
        print(new Message(message, IconKey.Error, Const.LogLevel.Minimal));
    }

    /**
     * Initialize a new Log.
     *
     * @param filename The filename of this log.
     * @throws IncompleteConfigurationException
     * @throws WarningException
     */
    public Log(String filename, Job job) {
        this.job = job;
        setFile(filename);
    }

    public void setFile(String filename) {
        if (filename.equals("")) {
            this.disable();
            return;
        }

        if (!filename.contains(File.separator)) {
            filename = DirSyncPro.getLogsPath(true) + filename;
        }

        if (file != null && file.getPath().equals(filename)) {
            return;
        }

        if (filename.contains("<") && filename.contains(">")) {
            wildCardedFileName = filename;
            filename = WildcardTools.replaceDateWildcards(filename, new Date());
            filename = WildcardTools.replaceTimeWildcards(filename, new Date());
            filename = WildcardTools.replaceUserWildcards(filename);
            if (job != null) {
                filename = WildcardTools.replaceDirectoryWildcards(filename, job);
            }
        } else {
            wildCardedFileName = "";
        }

        if (!filename.contains(File.separator) && !DirSyncPro.getLogsPath(false).equals("")) {
            filename = DirSyncPro.getLogsPath(true) + filename;
        }

        try {
            file = new File(filename);

            if (!file.exists()) {
                if (file.getParentFile() != null) {
                    file.getParentFile().mkdirs();
                }
                if (!file.createNewFile()) {
                    throw new FileNotFoundException("Cannot create logfile '" + file.getAbsolutePath() + "'!");
                }
            }

            if (!file.canWrite()) {
                throw new FileNotFoundException("Cannot write to logfile '" + file.getAbsolutePath() + "'!");
            }

            if (!file.isFile()) {
                throw new FileNotFoundException("Logfile '" + file.getAbsolutePath() + "' isn't a file!");
            }

            // close the buffer if already exists to free the file
            if (out != null) {
                out.close();
                out = null;
            }
            out = new BufferedWriter(new FileWriter(file, true));
            writeLog(new Message("*****************************************", null, null));
            writeLog(new Message("***** DirSync Pro logging started.", null, null));
            writeLog(new Message("***** DirSync Pro version: " + Const.VERSION, null, null));
            writeLog(new Message("***** Operating System: " + System.getProperty("os.name"), null, null));
            writeLog(new Message("***** Operating Sytem version: " + System.getProperty("os.version"), null, null));
            writeLog(new Message("***** Operating System architecture: " + System.getProperty("os.arch"), null, null));
            writeLog(new Message("***** Java version: " + System.getProperty("java.version"), null, null));
            writeLog(new Message("***** Java vendor: " + System.getProperty("java.vendor"), null, null));
            writeLog(new Message("***** File Encoding: " + System.getProperty("file.encoding"), null, null));
            writeLog(new Message("*****************************************", null, null));
        } catch (IOException e) {
            DirSyncPro.displayError("Log file '" + filename + "' could not be created.");
        }
    }

    private boolean printThisMessage(Message message) {
        LogLevel currentLogLevel = DirSyncPro.getSync().getLogLevel();
        LogLevel messageLogLevel = message.getLoglevel();

        return messageLogLevel.compareTo(currentLogLevel) <= 0;
//		(
//				currentLogLevel.equals(LogLevel.Minimal)
//				&&
//				(messageLogLevel.equals(LogLevel.Minimal))
//		) ||
//		(
//				currentLogLevel.equals(LogLevel.Moderate)
//				&&
//				(messageLogLevel.equals(LogLevel.Minimal) || messageLogLevel.equals(LogLevel.Moderate))
//		) ||
//		(
//				currentLogLevel.equals(LogLevel.Excessive)
//				&&
//				(messageLogLevel.equals(LogLevel.Minimal) || messageLogLevel.equals(LogLevel.Moderate) || messageLogLevel.equals(LogLevel.Excessive))
//		);
    }

    private void writeLog(Message m) {
        try {
            if (isEnabled()) {
                out.write(m.getDateStr() + " " + m + System.getProperty("line.separator"));
                out.flush();
            }
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * Prints a string with Minimal LogLevel
     *
     * @param s the string to print
     */
    public void printMinimal(String s, IconKey i) {
        print(new Message(s, i, LogLevel.Minimal));
    }

    /**
     * Prints a string with Moderate LogLevel
     *
     * @param s the string to print
     */
    public void printModerate(String s, IconKey i) {
        print(new Message(s, i, LogLevel.Moderate));
    }

    /**
     * Prints a string with Excessive LogLevel
     *
     * @param s the string to print
     */
    public void printExcessive(String s, IconKey i) {
        print(new Message(s, i, LogLevel.Excessive));
    }

    protected void addToMessageQ(Message message) {
        messages.add(message);
        messageQUpdated = true;
    }

    /**
     * prints a message to the log
     */
    private void print(Message message) {

        boolean printable = printThisMessage(message);
        Log jsLog = DirSyncPro.getSync().getLog();
        Log dspLog = DirSyncPro.getLog();

        boolean isJsLog = this.equals(jsLog);
        boolean isDspLog = this.equals(dspLog);
        boolean isJobLog = !isJsLog && !isDspLog;

        if (printable) {
            // Write to own log file
            writeLog(message);

            if (isJobLog) {
                // Also write to Jobset Log and DSP Log
                jsLog.writeLog(message);
                dspLog.writeLog(message);
            }
            if (isJsLog) {
                // Also write to Jobset Log and DSP Log
                dspLog.writeLog(message);
            }

            //for the message table
            jsLog.addToMessageQ(message);

            // echo to console only if no gui selected
            if (DirSyncPro.isOption_noGui()) {
                System.out.println(message);
            }
        }
    }

    /**
     * Close the log on garbage collection.
     *
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        out.close();
        super.finalize();
    }

    /**
     * Gets the path of the log.
     *
     * @return Returns the path.
     */
    public String getPath() {
        if (isEnabled()) {
            return file.getAbsolutePath();
        } else {
            return "";
        }
    }

    /**
     * Gets the path of the log.
     *
     * @return Returns the path.
     */
    public String getParentPath() {
        if (isEnabled()) {
            return file.getParentFile().getAbsolutePath();
        } else {
            return "";
        }
    }

    /**
     * Gets the file name of the log.
     *
     * @return Returns the filename.
     */
    public String getFilename() {
        if (isEnabled()) {
            if (wildCardedFileName.equals("")) {
                return file.getName();
            } else {
                return wildCardedFileName;
            }
        } else {
            return "";
        }
    }

    /**
     * disable this log
     */
    public void disable() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
            }
            out = null;
        }
        file = null;
    }

    public boolean isEnabled() {
        return (file != null);
    }

    /**
     * @return the messages
     */
    public MessageQ getMessages() {
        return messages;
    }

    /**
     * Cleans the messagesQ
     */
    public void cleanMessages() {
        messages = new MessageQ();
        messageQUpdated = true;
    }

    public void setPath(String path) {
        if (isEnabled()) {
            String filename = getFilename();
            if (!path.equals("")) {
                if (path.endsWith(File.separator)) {
                    filename = path + filename;
                } else {
                    filename = path + File.separator + filename;
                }
            }
            setFile(filename);
        }
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public boolean isMessageQUpdated() {
        return messageQUpdated;
    }

    public void setMessageQUpdated(boolean messageQUpdated) {
        this.messageQUpdated = messageQUpdated;
    }
}
