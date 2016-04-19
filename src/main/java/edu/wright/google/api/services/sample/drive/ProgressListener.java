package edu.wright.google.api.services.samples.drive;

/**
 *
 * @author Argie
 */
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.api.client.googleapis.media.MediaHttpDownloaderProgressListener;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.googleapis.media.MediaHttpUploaderProgressListener;
import java.io.IOException;
import java.text.NumberFormat;

public class ProgressListener implements MediaHttpUploaderProgressListener, MediaHttpDownloaderProgressListener {

    @Override
    public void progressChanged(MediaHttpDownloader downloader) {
        switch (downloader.getDownloadState()) {
            case MEDIA_IN_PROGRESS:
                System.out.println("Download is in progress: " + downloader.getProgress());
                break;
            case MEDIA_COMPLETE:
                System.out.println("Download is Complete!");
                break;
        }
    }

    @Override
    public void progressChanged(MediaHttpUploader uploader) throws IOException {
        switch (uploader.getUploadState()) {
            case INITIATION_STARTED:
                System.out.println("Upload Initiation has started.");
                break;
            case INITIATION_COMPLETE:
                System.out.println("Upload Initiation is Complete.");
                break;
            case MEDIA_IN_PROGRESS:
                System.out.println("Upload is In Progress: "
                        + NumberFormat.getPercentInstance().format(uploader.getProgress()));
                break;
            case MEDIA_COMPLETE:
                System.out.println("Upload is Complete!");
                break;
        }
    }
}
