package general.ex.stringhandling;

import java.util.Collections;

public class StringCompareEx {

	public static void main(String args[]) {

		usingEqualsMethod();
		
		usingEqualtoMethod();
		
		usingCompareToMethod();
		
	}

	private static void usingCompareToMethod() {
		String s1 = "Harish";
		String s2 = "Harish";
		String s3 = "Kishore";
		String s4 = "Hareth";
		String s5 = "Abi";
		String s6 = "";
		String s7 = "harish";
		String s8 = "HARISH";
		
		System.out.println("\nCompareTo method: ");
		System.out.println(s1.compareTo(s2)); // 0, bcoz both content and case are same
		System.out.println(s1.compareTo(s3)); // -3, bcoz 'H' is smaller than 'K' -- S1 < S3
		System.out.println(s3.compareTo(s1)); // 3, bcoz 'K' is greater than 'H' -- S3 > S1
		System.out.println(s1.compareTo(s4)); // 4, bcoz 'har' same, but 'i' is greater than 'e' -- S1 > S3
		
		System.out.println("\nCompareTo method with empty strings: ");
		System.out.println(s1.compareTo(s6)); // 6, bcoz subtract the length with empty string -- S1 - S6 = 6-0 = 6
		System.out.println(s6.compareTo(s5)); // -3, bcoz subtract the length with s4 string -- S5 - S4 = 0-3 = -3
		
		System.out.println("\nCompareTo method (Case sensitive): " );
		System.out.println(s7.compareTo(s8)); // 32, compareTo method is an case sensitive and char value comparison
		
		String b = null;
		String c = "Kill";
		b += c;
		System.out.println(b);
	}
	
	// "==" operator, it compares reference not values
	private static void usingEqualtoMethod() {
		String s1 = "World";
		String s2 = "World";
		String s3 = new String("World");
		
		System.out.println("\nEqualTo (==) method: ");
		System.out.println(s1 == s2); // true - Both refer to same instance
		System.out.println(s1 == s3); // False - s1 refer to string constant pool reference, s3 refer to heap(non-poo) memory instance
	}
	
	private static void usingEqualsMethod() {
		String s1 = "World";
		String s2 = "World";
		String s3 = "world";
		String s4 = new String("World");
		String s5 = "Moon";
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // False - Bcoz case sensitive is not same
		System.out.println(s1.equals(s4)); // True
		System.out.println(s1.equals(s5)); // False - Bcoz value is different
		
		System.out.println("\nEqualsIgnoreCase method:");
		System.out.println(s1.equalsIgnoreCase(s2)); // True
		System.out.println(s1.equalsIgnoreCase(s3)); // True - Bcoz here case sensitive is not consider
	}

}
