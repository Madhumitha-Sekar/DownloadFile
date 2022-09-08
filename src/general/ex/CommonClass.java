package general.ex;

public class CommonClass {

	private CommonClass() {
		System.out.println("CommonClass constructor invoked...");
	}
	
	public CommonClass(String parameter) {
		this();
		System.out.println("CommonClass parameterized constructor invoked..." + parameter);
	}
	
	public final void finalMethodValidation(final String firstInput, String secondInput) {
		System.out.println("CommonClass.. FinalMethodValidation method invoked... " + firstInput + " " + secondInput);
//		firstInput = firstInput + secondInput; // Cannot able to change the value of final parameter (variable 'firstInput')
	}
	
}
