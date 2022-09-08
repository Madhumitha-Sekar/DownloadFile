package general.ex.stringhandling;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class StringClassEx {

	public static void main(String[] args) {
		caseMethod();
		trimMethod();
		startsAndEndsWithMethod();
		charAtMethod();
		lengthMethod();
		internMethod();
		valueOfMethod();
		replaceMethod();
		formatMethod();
		getBytesMethod();
		diffBytesMethod();
		getCharsMethod();
		indexOfMethod();
	}
	
	private static void indexOfMethod() {
		String str1 = "Welcome to happiest world";
		int indexResult = str1.indexOf('o');
		System.out.println(indexResult);
		
		String str2 = "Happiest world";
		System.out.println(str2.indexOf("world"));
	}

	private static void getCharsMethod() {
		String str1 = "Welcome to happiest world";
		char[] ch = new char[25];
		str1.getChars(8, 20, ch, 5);
		System.out.println(ch);
	}

	private static void diffBytesMethod() {
		String str1 = "Happiest person";
		try {
			byte[] byteArr1 = str1.getBytes("UTF-16");
			for (byte byteValue : byteArr1) {
				System.out.print(byteValue);
			}

			System.out.println();
			byte[] byteArr2 = str1.getBytes("UTF-8");
			for (byte byteValue : byteArr2) {
				System.out.print(byteValue);
			}
			
			System.out.println();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	private static void getBytesMethod() {
		String str1 = "saravanan";
		byte[] byteArray = str1.getBytes();
		System.out.println(byteArray);
		String ss = new String(byteArray);
		System.out.println(ss);
		for (byte byteValue: byteArray) {
			System.out.print(byteValue + " ");
		}
		System.out.println();
	}

	private static void formatMethod() {
		String str1 = String.format("The name of king is %s", "careness");
		System.out.println(str1);
		String str2 = String.format("The age of king is %d", 29);
		System.out.println(str2);
		
		String str3 = String.format("The favourite letter is %C", 'N');
		System.out.println(str3);
		
		String str4 = String.format("Salary of king: |%08d|", 40);
		System.out.println(str4);
		
		String str5 = String.format("Salary of king: %x", 96);
		System.out.println(str5);
	}

	private static void replaceMethod() {
		String str1 = "World best mindset is kindness is always best";
		str1 = str1.substring(0, str1.indexOf("always"));
		System.out.println(str1.replaceFirst("is", "ak"));
	}
	
	private static void valueOfMethod() {
		String str1 = String.valueOf(true);
		System.out.println("Boolean value: " + String.valueOf(str1));
		Integer str2 = new Integer(10);
		System.out.println("Integer value: " + String.valueOf(str2));
		Float str3 = new Float(10.3f);
		System.out.println("Float value: " + String.valueOf(str3));
		String str4 = "sdwdf";
		System.out.println("String value:  "+ str4);
	}
	
	private static void internMethod() {
		String str1 = "Kumar12";
		String str2 = "Kumar12";
		String str3 = new String("Kumar12");
		String str4 = str3.intern();
		
		System.out.println( "s1=" + System.identityHashCode( str1 ) );
		System.out.println( "s2=" + System.identityHashCode( str2 ) );
		System.out.println( "s3=" + System.identityHashCode( str3 ) );
		System.out.println( "s4=" + System.identityHashCode( str4 ) );

	}

	private static void lengthMethod() {
		String str = "Sharma";
		System.out.println(str.length()); // 6
	}

	private static void charAtMethod() {
		String str = "Sharma";
		System.out.println(str.charAt(3)); // r
	}

	private static void startsAndEndsWithMethod() {
		String str = " Sharma";
		System.out.println(str.startsWith(" Sh"));
		System.out.println(str.endsWith("ma"));
	}

	private static void caseMethod() {
		String str = "Sharma";
		System.out.println(str.toUpperCase()); // SHARMA
		System.out.println(str.toLowerCase()); // sharma
		System.out.println("Locale: " + str.toLowerCase(Locale.CHINA));
		System.out.println(str); // Sharma
	}
	
	private static void trimMethod() {
		String str = "Hi";
		String sttr =  "Bye";
		String str1 = " Sharma";
		String str2 = "Sharma ";
		String str3 = " Sharma ";
		System.out.println(str + str1.trim() + sttr);
		System.out.println(str + str2.trim() + sttr);
		System.out.println(str + str3.trim() + sttr);
	}

}
