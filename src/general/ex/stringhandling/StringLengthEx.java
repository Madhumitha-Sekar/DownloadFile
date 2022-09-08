package general.ex.stringhandling;

public class StringLengthEx {

	public static void main (String args[]) {
		
		lengthEx();
		ReverseStringEx();
		
	}

	private static void ReverseStringEx() {
		String str = "Welcome to Happiest World";
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(str.length()-i-1));
		}
		
		System.out.println();
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		String emptySpace = " ";
		String newStr = emptySpace + str + emptySpace;
		System.out.println("With Whitespace string length is: " + newStr.length());
		
		String withOutWhiteSpaceStr = newStr.replace(" ", "");
		System.out.println(withOutWhiteSpaceStr);
		System.out.println("Wihtout Whitespace string length is: " + withOutWhiteSpaceStr.length());
		
	}

	private static void lengthEx() {
		String str = "Happiest";

		if (0 < str.length()) {
			System.out.println("The value of string str is not empty...");
		}

		str = "";
		if (0 == str.length()) {
			System.out.println("The value of string str is empty...");
		}
	}
	
}