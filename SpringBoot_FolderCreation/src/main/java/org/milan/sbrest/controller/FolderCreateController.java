/**
 * 
 */
package org.milan.sbrest.controller;

import java.io.File;
import java.io.IOException;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.FileSystemUtils;

/**
 * @author Milan
 *
 */
public class FolderCreateController {

	String remotePath = "/Users/Milan/Documents/My Games/remote";
	String localPath = "/Users/Milan/Documents/My Games/local";

//	@Bean
	public boolean createFolder(String userInput) throws IOException {
		System.out.println("Controller Class " + userInput);
		boolean resultInfo = false;

		if (userInput.equalsIgnoreCase("yes")) {

			File remoteFolder = new File(remotePath);
			File localFolder = new File(localPath);

			System.out.println("RemotePath--------->" + remotePath);
			System.out.println("LocalPath--------->" + localPath);

			// true if the folder is present in local directory, false otherwise
			if (localFolder.exists()) {
				System.out.println("LocalFolder is already present");
				// Files are copying to local folder from the remote folder
				FileSystemUtils.copyRecursively(remoteFolder, localFolder);
				resultInfo = true;
			} else if (!localFolder.exists()) {
				System.out.println("Local Folder is not present");
				// creating the folder in local directory
				if (localFolder.mkdirs()) {
					System.out.println("Local Folder is created!");
					// Files are copying to local folder from the remote folder
					FileSystemUtils.copyRecursively(remoteFolder, localFolder);
					// For Moving the files
					// Files.move(source, target);
					resultInfo = true;
				}
			} else {
				System.out.println("Failed to create directory!");
//				return new FolderCreationError("Not able to create the folder in local directory");
				resultInfo = false;
			}
		} else {
//			return new ConnectionError("Not able to get the sftp connection");
			resultInfo = false;
		}
		return resultInfo;
	}

	/*
	 * private static String getFileExtension(File file) { // convert the file name
	 * into string String fileName = file.toString(); System.out.println("File-" +
	 * fileName); if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".")
	 * != 0) { System.out.println("F------>" +
	 * fileName.substring(fileName.lastIndexOf(".") + 1)); return
	 * fileName.substring(fileName.lastIndexOf(".") + 1); } else return ""; }
	 */
}