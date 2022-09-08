package general.ex.programs;

public class PyramidEx {

	public static void main(String[] args) {
		pyramidExample1();
		pyramidExample2();
	}

	private static void pyramidExample2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pyramidExample1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
