package general.ex.programs;

public class GeneralProgramEx {

	public static void main(String[] args) {
		GeneralProgramEx ex = new GeneralProgramEx();
		ex.fact(5);
		ex.testMethod();
	}

	public void testMethod() {
		System.out.println("GeneralProgramEx.testMethod()... ");
	}

	private void fact(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		System.out.println("The factorial value of " + n + " is: " + result);
	}

}
