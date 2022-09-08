package general.exception.ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CommonExceptionEx {

	public static void main(String[] args) {
		// multiCatchBlockExample();
		/*try {
			finallyBlockExample();
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Arithmetic exception occured in main block");
		} catch (IOException e) {
			System.out.println(e);
		}*/
		
		try {
			throwExample();
		} catch (RuntimeException e) {
			System.out.println("Main method exception -- occured ");
		}
		
		System.out.println("Main method - Normal flow exectuion... ");
	}

	private static void throwExample() {
		uncheckedException();
		System.out.println("throwExample - Normal flow exectuion... ");
	}

	private static void uncheckedException() {
		String str = "Computer";
			if (str.equals("Computer")) {
				throw new RuntimeException("RuntimeException - unchecked exception occurred... ");
				// throw new IOException("IOException - checked exception occured... ");
			}
		System.out.println("unchecked Exception method() - Normal flow exectuion... ");
	}
	
	private static void finallyBlockExample() throws IOException {
		checkedExceptionMethod();
		
		try {
			int a = 10/0;
			System.out.println("finally try block... " + a);
		} catch (Exception e) {
			System.out.println("Arithmetic exception occured...");
			throw new ArithmeticException("Arithmetic exception thrown...");
		} finally {
			System.out.println("Finally block executed...");
		}
	}

	private static void checkedExceptionMethod() throws IOException {
		String str = " ";
		if (str == " ") {
			throw new IOException("IOException occured...");
		}
	}

	private static void multiCatchBlockExample() {
		try {
			FileReader file = new FileReader("C://Documents");
			System.out.println(file);
			int i = 10/0;
			System.out.println(i);
			
		} catch (NullPointerException e) {
			System.out.println("Multiple block NullPointerException... ");
		} catch (ArithmeticException e) {
			System.out.println("Multiple block ArithmeticException... ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Multi block ArrayIndexOutOfBoundsException");
		} catch (RuntimeException e) {
			System.out.println("Multi block RuntimeException");
		} catch (FileNotFoundException e) {
			System.out.println("Multi block FileNotFoundException");
		} catch (Exception e) {
			System.out.println("Mutiple block Exception... ");
		}
		
		System.out.println("Rest of the code execution...");
	}

}
