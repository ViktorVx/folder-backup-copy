package org.pva.folderbackupcopy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Objects;

@SpringBootApplication
public class FolderBackupCopyApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory
			.getLogger(FolderBackupCopyApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(FolderBackupCopyApplication.class, args);
		LOG.info("APPLICATION FINISHED");
	}

	@Override
	public void run(String... args) throws URISyntaxException, IOException {
		LOG.info("EXECUTING : command line runner");
		for (int i = 0; i < args.length; ++i) {
			LOG.info("args[{}]: {}", i, args[i]);
		}
//		var path = new File(FolderBackupCopyApplication.class.getProtectionDomain().getCodeSource().getLocation()
//				.toURI()).getPath();
//		LOG.info("Path: {}", path);
//		String actualFile = new File(FolderBackupCopyApplication.class.getProtectionDomain().getCodeSource().getLocation()
//				.toURI()).getPath();
		var jarPath = FolderBackupCopyApplication.class
				.getProtectionDomain()
				.getCodeSource()
				.getLocation();
		var name = new java.io.File(FolderBackupCopyApplication.class.getProtectionDomain()
				.getCodeSource()
				.getLocation()
				.getPath())
				.getName();

//		var path2 = new File(FolderBackupCopyApplication.class.getProtectionDomain().getCodeSource().getLocation().toURI());
//		FolderBackupCopyApplication.class.getResourceAsStream()
		LOG.info("Path2: {}", jarPath.getFile());
		LOG.info("Path3: {}", System.getProperty("user.dir"));
		LOG.info("Path4: {}", name);
	}
}
