package general.ex.stringhandling;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main (String args[]) {
		
//		basicEx();
		delimitEx();
	}

	private static void delimitEx() {
		StringTokenizer token = new StringTokenizer("My/nam/e/is/Raj", "/");
		String[] tokenValues = new String[token.countTokens()];
		int count = 0;
		
		while (token.hasMoreTokens()) {
			tokenValues[count++] = token.nextToken();
		}
		
		System.out.println("Result printed here: " + Arrays.toString(tokenValues)); // [My, nam, e, is, Raj]
//		System.out.println("Result printed here: " + Arrays.asList(tokenValues)); // [My, nam, e, is, Raj]

	}

	private static void basicEx() {
		StringTokenizer token = new StringTokenizer("My name is Raj");
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
