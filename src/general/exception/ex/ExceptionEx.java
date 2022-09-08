package general.exception.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionEx {

	public static void main(String[] args) {
//		exceptionMethodWithCatch();
//		exceptionMethodWithFinally();
//		exceptionMethodWithTryResource();
		/*try {
		exceptionMethodWithInnerTry();
		} catch (ArithmeticException e) {
			System.out.println("Main class catch...");
		}*/
		
		ExceptionEx newEx = new ExceptionEx();
		System.out.println("newEX... " + newEx);
		try {
			diffException("Siva");
		} catch (ArithmeticException e) {
			System.out.println("Main class arithmeticException catch...");
		}
	}

	private static void diffException(String s1) throws ArithmeticException {
		System.out.println("diffException");
		try {
			String s2 = "Shankar";
			String s3 = s1 + s2;
			System.out.println("String value: " + s3);
			childException();
			System.out.println("childException completed... ");
		} catch (ParentException e) {
			int j = 10;
			if (j != 10) {
				System.out.println("Correct Value only");
			} else {
				System.out.println("ExceptionEx.diffException()... Arithmetic exception occured... ");
				throw new ArithmeticException("Inner try catch error occured... ");
			}
		} finally {
			System.out.println("Finally method executed... ");
		}
	}

	private static void childException() throws ChildException {
		System.out.println("childException");
		try {
			int i = 50 / 0;
			System.out.println("Arithmetic not occured... ");
		} catch (Exception e) {
			throw new ChildException("Inner try catch error occured... ");
		}
	}

	private static void exceptionMethodWithInnerTry() throws ArithmeticException {
		System.out.println("exceptionMethodWithInnerTry");
		try {
			int i = 50 / 0;
			System.out.println("Arithmetic not occured... ");
		} catch (Exception e) {
			int j = 10;
			if (j != 10) {
				System.out.println("Correct Value only");
			} else {
				throw new ArithmeticException("Inner try catch error occured... ");
			}
		} finally {
			System.out.println("Finally method executed... ");
		}
	}

	private static void exceptionMethodWithTryResource() {
		System.out.println("exceptionMethodWithTryResource");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from emp");) {
			System.out.println("Connection connected");
		} catch (ArithmeticException | SQLException e) {
			System.out.println("Error occured in exceptionMethodWithTryResource method... " + e);
		}
	}

	private static void exceptionMethodWithFinally() {
		System.out.println("exceptionMethodWithFinally");
		try {
			int i = 0;
			int j = 0 / 50;
			int k = 10;

			System.out.println(j);
			System.out.println(k);
		} finally {
			System.out.println("Finally block printed... ");
		}
	}

	private static void exceptionMethodWithCatch() {
		System.out.println("exceptionMethodWithCatch");
		try {
			int i = 0;
			int j = 0 / 50;
			int k = 10;

			System.out.println(j);
			System.out.println(k);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
