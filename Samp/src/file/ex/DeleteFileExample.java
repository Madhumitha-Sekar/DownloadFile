package file.ex;

import java.io.File;

public class DeleteFileExample {

	public static void main(String args[]) {
		String filePath = FileConstants.LOCAL_FILE_PATH.getValue();

		// useDeleteMethod(filePath);

		useDeleteOnExitMethod(filePath);
		OpenFileExample.testProtectedPurpose();

	}

	/**
	 * Use 'DeleteOnExit' method to delete the file from the specified path
	 * 
	 * @param filePath
	 */
	private static void useDeleteOnExitMethod(String filePath) {
		firstDeleteOnExitMethod(filePath);
		secondDeleteOnExitMethod(filePath);
	}

	/**
	 * Use 'File' method to implement the 'DeleteOnExit' process to delete the
	 * file
	 * 
	 * @param filePath
	 */
	private static void secondDeleteOnExitMethod(String filePath) {
		try {
			File file = new File(filePath);
			file.deleteOnExit();
			System.out.println("Done!!!");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Use 'CreateTempFile' method to implement the 'DeleteOnExit' process to
	 * delete the file
	 * 
	 * @param filePath
	 */
	private static void firstDeleteOnExitMethod(String filePath) {
		try {
			File file = File.createTempFile("abc", ".temp");
			System.out.println("Temp file created loc: " + file.getAbsolutePath());
			System.out.println("Temp file exists at before: " + file.exists());
			file.deleteOnExit();
			System.out.println("Temp file exists at after: " + file.exists());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Use 'Delete()' method to delete the file from the specified path
	 * 
	 * @param filePath
	 */
	private static void useDeleteMethod(String filePath) {
		try {
			File file = new File(filePath);
			boolean checkStatus = file.delete();
			System.out.println("File successfully deleted: " + checkStatus);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
