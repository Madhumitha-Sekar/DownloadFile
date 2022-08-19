package string.ex;

public class StringEx {

	public static void main(String[] args) {
		simpleStringMethod();
		stringCommonMethod();
		subStringMethod();
	}

	private static void subStringMethod() {
		String name = "Siva";
		String sbString = name.substring(0, 4);
		System.out.println(sbString);
	}

	private static void stringCommonMethod() {
		String name = "siva";
		String strFormat = String.format("name is %s", name);
		String strFormatNumeric = String.format("Numeric value is %.5f", 18.32);
		System.out.println("String format example : " + strFormat + " Numeric format: " + strFormatNumeric);
	}

	private static void simpleStringMethod() {
		char[] ch = {'j', 'a', 'v', 'a'};
		String str = new String(ch);
		System.out.println("Char values string ex: " + str);
		
		String strValue = "java";
		System.out.println("String values ex: " + strValue);
	}

}
