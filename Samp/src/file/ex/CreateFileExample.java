package file.ex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileExample {

	public static void main(String args[]) {
		String filePath = FileConstants.LOCAL_FILE_PATH.getValue();

		// useCreateNewFileToFile(filePath);

		 useFileOutputStreamMethod(filePath);

		// useCreateFileNIO(filePath);

		System.out.println("File example execution completed successfully... ");
	}

	/**
	 * Use 'NIO' filemethod to create empty file at specific location
	 * 
	 * @param filePath
	 */
	private static void useCreateFileNIO(String filePath) {
		System.out.println("Use createFile NIO executed...");
		try {
			Path path = Paths.get(filePath);
			Path p = Files.createFile(path);
			System.out.println("Files created at path: " + p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Use 'FileOutputStream method to create file and write the content into
	 * the file
	 **/
	private static void useFileOutputStreamMethod(String filePath) {
		System.out.println("UseFileOutputStream method execution start...");
		try (FileOutputStream fos = new FileOutputStream(filePath,
				true)) { /** true for append mode **/
			String fileContentStr = "This content saved into the file... Must... ";
			fos.write(fileContentStr.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("UseFileOutputStream method execution completed...");
	}

	/** Use 'CreateNewFile()' method to create the 'New empty file' **/
	private static void useCreateNewFileToFile(String filePath) {
		try {
			File file = new File(filePath);
			if (file.createNewFile()) {
				System.out.println("New file has been created based on 'CreateNewFile()' method in java... ");
				System.out.println("file created " + file.getCanonicalPath());
			} else {
				System.out.println("New file has not been created based on 'CreateNewFile()' method in java... ");
				System.out.println("File already exist at location:" + file.getCanonicalPath());
			}
		} catch (Exception e) {
			System.out.println(
					"Error exception occured when try to create the file using 'CreateNewFile()' method in java...");
		}
	}

}
