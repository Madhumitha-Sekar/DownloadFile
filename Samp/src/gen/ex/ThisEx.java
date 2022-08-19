package gen.ex;

public class ThisEx {

	public ThisEx() {
		this(5);
		System.out.println("Constructor called...");
	}
	
	public ThisEx(int i) {
		System.out.println("Constructor called with integer parameterized...");
	}

	int a = 10;
	public static void main(String[] args) {
		ThisEx tx = new ThisEx();
		tx.sampleMethod();
	}
	private void sampleMethod() {
		System.out.println(this.a);
		System.out.println(this);
		this.anotherMethod();
	}
	private void anotherMethod() {
	}

}
