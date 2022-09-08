package general.ex.object;

public class WrapperClassEx {

	// int test = 20;
	static String test = "Anbu";

	public static void main(String args[]) {
//		SimpleWrapperMethod();
//		autoBoxingMethod();
//		unBoxingMethod();
		customWrapperMethod();
	}
	
	private static void customWrapperMethod() {
		CustomWrapperClass wrapperClass = new CustomWrapperClass(25);
		System.out.println("Wrapper class result: " + wrapperClass);
		System.out.println("Wrapper class toString: " + wrapperClass.toString());
	}
	
	private static void unBoxingMethod() {
		Integer a = new Integer(20);
		int b = a.intValue();
		int c = a; // Compiler internally write the code for us: a.intValue()
		
		System.out.println("Unboxing method value of a is " + a + " and b is " + b + " and c is " + c);
	}

	private static void autoBoxingMethod() {
		int a = 10;
		Integer b = Integer.valueOf(a);
		Integer c = a;
		
		System.out.println("AutoBoxing method value of a is " + a + " and b is " + b + " and c is " + c);
	}
	
	private static void SimpleWrapperMethod() {
		WrapperClassEx ex = new WrapperClassEx();
		System.out.println("Main method: Before change value: " + ex.test);
		simpleWrapperEx(ex);
		System.out.println("Main method: After change value: " + ex.test);
	}

	private static void simpleWrapperEx(WrapperClassEx ex) {
		System.out.println("Before change value: " + ex.test);
		// ex.test = ex.test + 30;
		ex.test = "Kathir";
		System.out.println("After change value: " + ex.test);
	}

}

class CustomWrapperClass {
	private int i;
	
	CustomWrapperClass() {}
	
	CustomWrapperClass(int i) {
		this.i = i;
	}
	
	public int getValue() {
		return i;
	}
	
	public void setValue(int i) {
		this.i = i;
	}
	
	@Override
	public String toString() {
		return Integer.toString(i);
	}
	
}