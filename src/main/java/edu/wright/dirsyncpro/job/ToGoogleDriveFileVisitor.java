
package edu.wright.dirsyncpro.job;

import edu.wright.google.api.services.drive.DriveSync;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author Joe
 */
public class ToGoogleDriveFileVisitor extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        DriveSync.uploadFile(file.toFile());

        return FileVisitResult.CONTINUE;
    }
}
