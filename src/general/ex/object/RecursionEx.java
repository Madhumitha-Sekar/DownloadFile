package general.ex.object;

public strictfp class RecursionEx {

	static int count = 1;
	static int n1 = 0, n2 = 1, n3 = 0;
	public static void main(String args[]) {
		simpleRecursiveMethod();
		System.out.println("Factorial Result: " + factorialExample(5));
		int n = 15;
		System.out.print("Fibonacci series result: " + n1 + " " + n2);
		fibonacciSeriesExample(n-2);
	}
	
	private strictfp static void fibonacciSeriesExample(int n) {
		if (n >= 1) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			System.out.print(" " + n3);
			fibonacciSeriesExample(n - 1);
		}
	}
	
	private static int factorialExample(int factNum) {
		if (factNum == 1) {
			return 1;
		} else {
			return factNum * factorialExample(factNum - 1);
		}
	}

	private static void simpleRecursiveMethod() {
		if (count <= 5) {
			System.out.println("Hello " + count++);
			simpleRecursiveMethod();
		}
	}

}
