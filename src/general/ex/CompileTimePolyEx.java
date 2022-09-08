package general.ex;

public class CompileTimePolyEx {
	public static void main(String args[]) {
		apartment("Modern");
		apartment("Modern", "Natural");
	}

	private static void apartment(String building1, String building2) {
		System.out.println("Double apartment options: Building1 name is " + building1 + " Building2 name is " + building2);
	}

	// If the method have an private or static or final, then it is called static binding.
	private static void apartment(String building1) {
		System.out.println("Single apartment options: Building1 name is " + building1);
	}
	
}