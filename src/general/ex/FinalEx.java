package general.ex;

public class FinalEx extends CommonClass {

	final static String FIRST_CONSTANT = "Computer"; // Final variable
	final String id; //blank final variable
	final static String dept; // Static blank final variable
	
	FinalEx() {
		super("One");
		id = "S2234";
		System.out.println("The value of id: " + id);
	}
	
	static {
		dept = "Software Engineer";
		System.out.println("The value of dept: " + dept);
	}
	
	private void finalVariableValidation() {
		// FIRST_CONSTANT = "System"; //The final field FinalEx.FIRST_CONSTANT cannot be assigned
	}

	// Cannot able to inherit the final class (super class) into sub class

	// Final method example:
	/*public final void finalMethodValidation(String firstInput, String secondInput) { // Cannot override the final method from CommonClass
		System.out.println("FinalMethodValidation method invoked... " + firstInput + " " + secondInput);
	}*/

	
	public static void main(String args[]) {
		FinalEx finEx = new FinalEx();
		finEx.finalVariableValidation();
		finEx.finalMethodValidation("FirstInput", "SecondInput"); // Able to access the final method, but cannot able to override it.
	}

}
