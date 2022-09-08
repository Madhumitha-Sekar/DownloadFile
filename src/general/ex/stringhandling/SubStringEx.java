package general.ex.stringhandling;

import java.util.Arrays;

public class SubStringEx {

	public static void main(String[] args) {
		
		subStringMethod();
		splitMethod();
	}
	
	private static void splitMethod() {
		String str = "Hello, my names is Sachin";
		String[] strResult = str.split(" ");
		
		for (String result: strResult) {
			System.out.println(result);
		}
		
		System.out.println(Arrays.toString(strResult));
	}
	
	private static void subStringMethod() {
		String s1 = "Machine";
		System.out.println(s1.substring(3)); // hine 
		System.out.println(s1.substring(2, 5)); // chi 
	}

}
