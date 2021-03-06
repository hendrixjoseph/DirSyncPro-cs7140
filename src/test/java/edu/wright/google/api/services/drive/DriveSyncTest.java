
package edu.wright.google.api.services.drive;

import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Joe Hendrix <hendrix.11@wright.edu>
 */
public class DriveSyncTest {

    private static final String UPLOAD_FILE_PATH = "C:\\test\\test.txt";
    private static final String DIR_FOR_DOWNLOADS = "C:\\test";
    private static final java.io.File UPLOAD_FILE = new java.io.File(UPLOAD_FILE_PATH);

    @Test
    public void testUpload() throws IOException {
        System.out.println("upload");
        DriveSync.uploadFile(UPLOAD_FILE);
    }

    @Test
    public void testDownload() throws IOException {
        System.out.println("download");
        DriveSync.downloadFiles(DIR_FOR_DOWNLOADS);
    }
}
