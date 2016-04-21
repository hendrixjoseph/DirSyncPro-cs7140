package edu.wright.google.api.services.drive;

/**
 *
 * @author Argie
 */
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.Drive.Files;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriveSync {

    private static final String APPLICATION_NAME = "DirSyncPro CS7140";

    /**
     * Directory to store user credentials.
     */
    private static final java.io.File DATA_STORE_DIR
            = new java.io.File(System.getProperty("user.home"), ".store/drive_sample");

    /**
     * Global instance of the HTTP transport.
     */
    private static HttpTransport HTTP_TRANSPORT;

    private static final List<String> SCOPES
            = Arrays.asList(DriveScopes.DRIVE_METADATA_READONLY);
    private static FileDataStoreFactory DATA_STORE_FACTORY;

    /**
     * Global instance of the JSON factory.
     */
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    /**
     * Global Drive API client.
     */
    private static Drive DRIVE;

    static {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
            DRIVE = getDriveService();
        } catch (GeneralSecurityException | IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static Drive getDriveService() throws IOException {
        Credential credential = authorize();
        return new Drive.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    /**
     * Authorizes the installed application to access user's protected data.
     */
    private static Credential authorize() throws IOException {
        // Load client secrets.
        InputStream in
                = DriveSync.class.getResourceAsStream("/client_secret.json");
        GoogleClientSecrets clientSecrets
                = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow
                = new GoogleAuthorizationCodeFlow.Builder(
                        HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(DATA_STORE_FACTORY)
                .setAccessType("offline")
                .build();
        Credential credential = new AuthorizationCodeInstalledApp(
                flow, new LocalServerReceiver()).authorize("user");
        System.out.println(
                "Credentials saved to " + DATA_STORE_DIR.getAbsolutePath());
        return credential;
    }

    public static File uploadFile(java.io.File file) throws IOException {
        File fileMetadata = new File();
        fileMetadata.setTitle(file.getName());

        FileContent mediaContent = new FileContent("image/jpeg", file);

        Drive.Files.Insert insert = DRIVE.files().insert(fileMetadata, mediaContent);
        MediaHttpUploader uploader = insert.getMediaHttpUploader();
        uploader.setDirectUploadEnabled(false);
        uploader.setProgressListener(new ProgressListener());
        return insert.execute();
    }

    public static void downloadFiles(String downloadPath) throws IOException {
        List<File> result = new ArrayList<>();
        Files.List request = DRIVE.files().list();

        do {
            try {
                FileList files = request.execute();

                result.addAll(files.getItems());
                request.setPageToken(files.getNextPageToken());
            } catch (IOException e) {
                System.out.println("An error occurred: " + e);
                request.setPageToken(null);
            }
        } while (request.getPageToken() != null
                && request.getPageToken().length() > 0);

        if (result.isEmpty()) {
            System.out.println("No files found.");
        } else {
            System.out.println(result.size() + " files found");
            for (File file : result) {
                downloadFile(downloadPath, file);
            }
        }
    }

    /**
     * Downloads a file using either resumable or direct media download.
     */
    private static void downloadFile(String downloadPath, File file)
            throws IOException {
        // create parent directory (if necessary)
        java.io.File parentDir = new java.io.File(downloadPath);
        if (!parentDir.exists() && !parentDir.mkdirs()) {
            throw new IOException("Unable to create parent directory");
        }
        OutputStream out = new FileOutputStream(new java.io.File(parentDir, file.getTitle()));

//        DRIVE.files().get(file.getId()).executeMediaAndDownloadTo(out);
        MediaHttpDownloader downloader
                = new MediaHttpDownloader(HTTP_TRANSPORT, DRIVE.getRequestFactory().getInitializer());
        downloader.setDirectDownloadEnabled(false);
        downloader.setProgressListener(new ProgressListener());
        downloader.download(new GenericUrl(file.getDownloadUrl()), out);
    }

    private DriveSync() {

    }
}
