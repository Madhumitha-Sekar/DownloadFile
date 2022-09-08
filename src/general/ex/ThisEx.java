package general.ex;

public class ThisEx {

	int id;
	String name;
	
	// Constructor example
	public ThisEx() {
		System.out.println("Constructor called successfully...");
		this.id = 10;
	}
	
	public ThisEx(String name) {
		this(); // Always constructor call will be the first line (like this() or super()).
				// But Method call is not like that restrictions
				// (like this.firstMethod() or super.hashCode()).
		System.out.println(super.hashCode());
		this.firstMethod();
		this.name = name;
		System.out.println("Value of id and name: " + id + ", " + name);
		new ThisEx(this);
	}
	
	public ThisEx(ThisEx thisEx) {
		System.out.println("'This' keyword passed in the argument for Constructor... ");
	}
	
	
	// Main example
	private void firstMethod() {
		new ThisEx();
		System.out.println("FirstMethod");
	}
	
	private void secondMethod() {
		this.firstMethod();
		System.out.println("SecondMethod");
		thisMethod(this);
	}
	
	private void thisMethod(ThisEx thisEx) {
		System.out.println("'This' keyword passed in the arg example... ");
	}
	
	private ThisEx returnThisMethod() {
		System.out.println("'This' keyword is passed in the return statement...");
		return this;
	}

	private void objReferenceExample() {
		System.out.println("Object reference inside method: " + this);
		System.out.println("hashCode() : " + hashCode());
		System.out.println("this.hashCode() : " + this.hashCode());
		System.out.println("super.hashCode() : " + super.hashCode());
	}
	
	// Main method
	public static void main (String args[]) {
		ThisEx ex1 = new ThisEx("Vijay");
		ex1.secondMethod();
		
		System.out.println(ex1.returnThisMethod());
		System.out.println("'This' keyword example completed...");
		
		System.out.println("Object reference: " + ex1);
		ex1.objReferenceExample();
	}
}
