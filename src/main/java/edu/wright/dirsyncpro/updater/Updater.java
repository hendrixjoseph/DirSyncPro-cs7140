package edu.wright.dirsyncpro.updater;

import edu.wright.dirsyncpro.Const;
import edu.wright.dirsyncpro.DirSyncPro;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Updater {

    UpdateXmlReader uxmlr;
    boolean inBackground = true;

    public Updater(boolean inB) {
        inBackground = inB;
        String url = Const.UPDATEURL;
        String urlParams = "";
        try {
            urlParams += "version=" + URLEncoder.encode(Const.VERSION, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        url += "?" + urlParams;

        uxmlr = new UpdateXmlReader(url, inBackground);
    }

    public void openDownloadURLinBrowser() {
        this.openBrowser(this.getUpdateURL());
    }

    public void openChangelogURLinBrowser() {
        this.openBrowser(this.getChangelogURL());
    }

    private void openBrowser(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (URISyntaxException e) {
            DirSyncPro.displayError("Update URL syntax error!");
        } catch (IOException e) {
            DirSyncPro.displayError("Unable to start the default internet browser!");
        }
    }

    /**
     * @return {@code String} the URL from which the update is to be downloaded.
     */
    public String getUpdateURL() {
        return uxmlr.getUpdateURL();
    }

    /**
     * @return {@code String} the new version which is available for download
     */
    public String getNewVersion() {
        return uxmlr.getNewVersion();
    }

    /**
     * @return {@code String} the major changes in this update
     */
    public String getChangelogURL() {
        String s = uxmlr.getChangeLogURL();
        return (s.equals("null") ? getUpdateURL() : s);
    }

    /**
     * @return {@code boolean} whether there is a new update available
     */
    public boolean isUpdateable() {
        return uxmlr.isUpdateable();
    }

    /**
     * @return {@code boolean} if contacting the update server has succeeded.
     */
    public boolean contacted() {
        return uxmlr.contacted();
    }

}
