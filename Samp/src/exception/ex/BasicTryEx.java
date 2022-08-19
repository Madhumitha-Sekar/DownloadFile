package exception.ex;

public class BasicTryEx {

	public static void main(String[] args) {
		tryFinallyMethod();
	}

	private static void tryFinallyMethod() {
		try {
			String s = "Siva";
			Integer j = Integer.valueOf(s);
			System.out.println("Integer value: " + j);
		} finally {
			System.out.println("Finally method executed... ");
		}
	}

}
