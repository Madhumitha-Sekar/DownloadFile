package general.ex;

public class MethodOverloadingEx extends LoopEx {

	static int count = 0;

	/* Method overloading example: Changing no of arguments */
	void sum(int l, long a, int b) {
		System.out.println("int arg method invoked");
	}

	/*void sum(int l, long a, long b) {
		System.out.println("long arg method invoked");
	}*/

	/* Method overloading example: Changing datatype of arguments */
	void sum (int l, long a, long b, int c) {
		System.out.println("arg method invoked for void datatype..");
	}
	
	/*
	 * Method overloading example: Changing datatype of arguments... Both
	 * datatype and parameters changes needed here.. else got compile time
	 * error..
	 */
	double sum(double l, long a, long b, int c) {
		System.out.println("arg method invoked for double datatype..");
		return c;
	}
	
	/* Additional check for Protected access specifier */
	public MethodOverloadingEx() {
		super.tempTestedEx();
	}

	/* Additional check for Protected access specifier */
	protected static void tempTestedEx() {
		System.out.println("tempTestedEx in MethodoverloadingEx... ");
	}
	
	/* Covariant return type example */
	@Override
	public MethodOverloadingEx check() {
		return this;
	}
	
	public static void main(String args[]) {
		MethodOverloadingEx obj = new MethodOverloadingEx();
		obj.sum(20, 20L, 20);// now int arg sum() method gets invoked

		/*System.out.println("Main method with string [] ");
		main("");
		System.out.println("Main method changes completed... ");*/
		
		double result = obj.sum(10d, 20, 30, 40);
		
		typePromotionMethod();

	}

	public static void typePromotionMethod() {
		MethodOverloadingEx ex = new MethodOverloadingEx();
		ex.typePromotionEx1(10, 10);
		
	}
	
	public void typePromotionEx1(int a, int b) {
		System.out.println("Int arg method invoked in typePromotionEx1... ");
	}
	
	/*public void typePromotionEx1(long a, long b) {
		System.out.println("Long arg method invoked in typePromotionEx1... ");
	}*/
	
	/*public void typePromotionEx1(int a, long b) {
		System.out.println("Int and Long arg combination method invoked in typePromotionEx1... ");
	}*/
	
	public void typePromotionEx1(long a, int b) {
		System.out.println("Long and Int arg combination method invoked in typePromotionEx1... ");
	}
	
	public static void main(String args) {
		System.out.println("Main method with string ");
		main();
	}

	public static void main() {
		System.out.println("Count: " + count++);
		System.out.println("Main method() ");
		if (count >= 3) {
			return;
		}
		main(new String[3]);
	}

}
