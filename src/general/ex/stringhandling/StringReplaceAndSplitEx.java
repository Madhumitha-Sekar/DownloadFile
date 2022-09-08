package general.ex.stringhandling;

import java.util.Arrays;

public class StringReplaceAndSplitEx {

	public static void main(String args[]) {

		replaceStringEx();
		splitStringEx();
		startsWithEx();

	}

	private static void startsWithEx() {
		String str = "HaHappiest";
		String findStr = "Ha";
		System.out.println(str.startsWith(findStr, 2));
	}

	private static void splitStringEx() {
		String str = "Welcome to happiest world";
		String[] splittedString = str.split("e", 0);
		System.out.println("Output of splitted string: " + Arrays.asList(splittedString));
	}

	private static void replaceStringEx() {
		String str = "Welcome to happiest world";
		str = str.replace("e", "z");
		System.out.println("Output of replace string: " + str);

		String replaceAllString = "Welcome to happiest world";
		replaceAllString = replaceAllString.replaceAll("e", "z");
		System.out.println("Output of replaceAll string: " + replaceAllString);
	}

}
