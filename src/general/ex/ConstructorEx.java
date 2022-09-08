package general.ex;

public class ConstructorEx {

	public ConstructorEx() {
		System.out.println("Default constructor invoked");
	}

	public ConstructorEx(String name) {
		System.out.println("Parameter constructor invoked: " + name);
	}

	public static void main(String[] args) {
		ConstructorEx consEx1 = new ConstructorEx();
		System.out.println("consEx1: " + consEx1);
		ConstructorEx consEx2 = new ConstructorEx("Siva");
		System.out.println("consEx2: " + consEx2);
	}

}