package general.ex.abstraction;

public abstract class CommonAbstractEx {

	String bodyFit = "Good";
	
	public CommonAbstractEx() {
		System.out.println("CommonAbstractClass.CommonAbstractClass().. constructor invoked...");
	}
	
	abstract void run();
	
	public Integer walk() {
		System.out.println("CommonAbstractClass.walk() method invoked... ");
		return 5;
	}
	
}
