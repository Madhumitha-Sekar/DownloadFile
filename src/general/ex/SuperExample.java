package general.ex;

public class SuperExample {

	public static void main (String args[]) {
		SuperExample2 superex = new SuperExample2(10, "Velu", "Developer");
		superex.validateSuperVariable();
		superex.validateSuperMethod();
		superex.displayValue();
	}
}
