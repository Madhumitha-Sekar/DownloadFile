package file.ex;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;

public class OpenFileExample {

	public static void main(String args[]) {

		File file = new File(FileConstants.LOCAL_FILE_PATH.getValue());
//		desktopFileOpenMethod(file);

		fileInputStreamOpenMethod(file);
		testProtectedPurpose();
	}

	protected static void testProtectedPurpose() {
		
	}

	private static void fileInputStreamOpenMethod(File file) {
		try (FileInputStream fis = new FileInputStream(file)) {
			System.out.println("File content:");
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (Exception e) {
		}
	}

	/** Use 'Desktop' method to open the file in the specific path **/
	private static void desktopFileOpenMethod(File file) {
		try {
			if (!Desktop.isDesktopSupported()) {
				System.out.println("Not supported...");
				return;
			}

			Desktop desktop = Desktop.getDesktop();
			if (file.exists()) {
				desktop.open(file);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
