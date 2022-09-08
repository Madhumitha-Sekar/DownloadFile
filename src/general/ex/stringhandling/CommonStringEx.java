package general.ex.stringhandling;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CommonStringEx {

	public static void main(String[] args) {
//		System.out.println(reverseStringEx("Sachin Tendulkar")); // rakludneT nihcaS
//		palindromeStringEx("Madam");
//		capitalizeString("this is java developer");
//		reverseWordStringEx("My world is always beautiful"); // yM dlrow si syawla lufituaeb
//		toggleWordStringEx("sachin Tendulkar"); // sACHIN tENDULKAR
//		anagramStringEx("Keep this", "Peek this");
//		percentageStringEx("Sachin TENDulkar 10%");
//		duplicateStringEx("Geeks for Geeks");
//		integerToStringEx(345);
//		stringToIntegerEx("2342");
//		removeWhiteSpaceEx("India is my 	country");
//		wordCountStringEx("  	India is my	 country ");
//		reverseStringPreserveSapceEx("India is my country");
//		swapStringEx("Lion", "Tiger");
//		removeParticularStringEx("India is my country", 7);
		countVowelsEx("Everyone is equal on the earth");
	}

	private static void countVowelsEx(String input) {
		int vowelCount = 0;
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case 'a': 
				vowelCount++;
				break;
			case 'e': 
				vowelCount++;
				break;
			case 'i': 
				vowelCount++;
				break;
			case 'o': 
				vowelCount++;
				break;
			case 'u': 
				vowelCount++;
				break;
			case 'A': 
				vowelCount++;
				break;
			case 'E': 
				vowelCount++;
				break;
			case 'I': 
				vowelCount++;
				break;
			case 'O': 
				vowelCount++;
				continue;
			case 'U': 
				vowelCount++;
				break;
			}
		}
		System.out.println("The length of vowel count is: "+ vowelCount);
	}

	private static void removeParticularStringEx(String input, int removeChar) {
		System.out.println(input.substring(0, removeChar) + input.substring(removeChar+1));
	}

	private static void swapStringEx(String input1, String input2) {
		System.out.println("Before swapping: " + input1 + ", " + input2);
		input1 = input1 + input2; // LionTiger
		input2 = input1.substring(0, input1.length() - input2.length()); // Lion
		input1 = input1.substring(input2.length());// Tiger
		System.out.println("After swapping: " + input1 + ", " + input2);
	}

	private static void reverseStringPreserveSapceEx(String input) {
		char[] inputArray = input.toCharArray();
		char[] result = new char[inputArray.length];
		System.out.println(result);

		for (int i = 0, j = inputArray.length - 1; i < inputArray.length; i++) {

			/*
			 * System.out.println("The value of i: " + i + " " + inputArray[i] + " and the value of j: " + j + " " + inputArray[j]);
			 * if (inputArray[i] == ' ') { 
			 * 	result[i] = ' '; 
			 * }
			 */

			if (inputArray[j] == ' ') {
				j--;
			}

			if (inputArray[i] != ' ') {
				if (j >= 0) {
					result[i] = inputArray[j];
				}
				j--;
			}
		}

		System.out.println("Result 1 " + Arrays.toString(result));
		System.out.println("Result 2 " + String.valueOf(result));
	}

	private static void wordCountStringEx(String input) {
		
		int count = 0;
		
		char[] ch = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			ch[i] = input.charAt(i);
			if ((i == 0 && ch[i] != ' ' && ch[i] != '\t') ||
					(i > 0 && ch[i]!= ' ' && ch[i-1] == ' ') && ch[i-1] != '\t') {
				count++;
			}
		}
		System.out.println("Total count of Word count: " + count++);
	}

	private static void removeWhiteSpaceEx(String input) {
//		1st Method:
		/*String result = input.replaceAll("\\s", "");
		System.out.println(result);*/
		
//		2nd Method:
		char[] inputCharArray = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for (char inputChar: inputCharArray) {
			if (inputChar != ' ' && inputChar != '\t') {
				sb.append(inputChar);
			}
		}
		
		System.out.println(sb.toString());
	}

	private static void stringToIntegerEx(String input) {
		Integer result1 = Integer.valueOf(input);
		System.out.println(result1);
		int result2 = Integer.parseInt(input);
		System.out.println(result2);
	}

	private static void integerToStringEx(int input) {
		String result1 = String.valueOf(input);
		System.out.println(result1);
		String result2 = Integer.toString(input);
		System.out.println(result2);
	}

	private static void duplicateStringEx(String input) {
/*//		1st Method:
		char[] inputCharArray = input.toCharArray();
		Map<Character, Integer> inputMap = new HashMap<Character, Integer>();

		for (Character inputChar: inputCharArray) {
			if (Character.isWhitespace(inputChar)) {
				continue;
			}
			if (inputMap.containsKey(inputChar)) {
				inputMap.put(inputChar, inputMap.get(inputChar) + 1);
			} else {
				inputMap.put(inputChar, 1);
			}
		}
		
		for (Entry<Character, Integer> resultEntry: inputMap.entrySet()) {
			int countValue = resultEntry.getValue();
			if (countValue > 1) {
				System.out.println(resultEntry.getKey() + " is repeated " + countValue + " times");
			}
		}*/
		
//		2nd Method:
		char[] inputCharArray = input.toCharArray();
		System.out.println("Duplicate values are: ");

		for (int i = 0; i < inputCharArray.length; i++) {
			int count = 1;
			for (int j = i + 1; j < inputCharArray.length; j++) {
				if (inputCharArray[i] != ' ' && inputCharArray[i] == inputCharArray[j]) {
					inputCharArray[j] = '0';
					count++;
				}
			}
			
			if (count > 1 && inputCharArray[i] != '0') {
				System.out.println(inputCharArray[i] + ": repeated " + count + " times");
			}
		}
		
	}

	private static void percentageStringEx(String input) {
		int totalLength = input.length();
		int uppercase = 0;
		int lowercase = 0;
		int digits = 0;
		int others = 0;
		
		char[] inputChar1 = input.toCharArray();
		for (char inputch: inputChar1) {
			if (Character.isUpperCase(inputch)) {
				uppercase++;
			} else if (Character.isLowerCase(inputch)) {
				lowercase++;
			} else if (Character.isDigit(inputch)) {
				digits++;
			} else {
				others++;
			}
		}
		/*for (int i = 0; i < totalLength; i++) {
			char inputChar = input.charAt(i);
			if (Character.isUpperCase(inputChar)) {
				uppercase++;
			} else if (Character.isLowerCase(inputChar)) {
				lowercase++;
			} else if (Character.isDigit(inputChar)) {
				digits++;
			} else {
				others++;
			}
		}*/
		
		double uppercasePerc = (uppercase * 100) / totalLength;
		double lowercasePerc = lowercase * 100 / totalLength;
		double digitsPerc = digits * 100 / totalLength;
		double othersPerc = others * 100 / totalLength;
		
		DecimalFormat decimalFormat = new DecimalFormat("##.##");
		System.out.println("Percentage of uppercase letter: " + decimalFormat.format(uppercasePerc));
		System.out.println("Percentage of lowercase letter: " + decimalFormat.format(lowercasePerc));
		System.out.println("Percentage of uppercase letter: " + decimalFormat.format(digitsPerc));
		System.out.println("Percentage of lowercase letter: " + decimalFormat.format(othersPerc));
		
	}

	private static void anagramStringEx(String inputStr1, String inputStr2) {
		// String inputStr1 = input1.replaceAll("\\s", "");
		// String inputStr2 = input2.replaceAll("\\s", "");

		boolean result = false;
		if (inputStr1.length() != inputStr2.length()) {
			result = false;
		} else {
			char[] inputchar1 = inputStr1.toLowerCase().toCharArray();
			Arrays.sort(inputchar1);

			char[] inputchar2 = inputStr2.toLowerCase().toCharArray();
			Arrays.sort(inputchar2);

			result = Arrays.equals(inputchar1, inputchar2);

			System.out.println("s" + String.valueOf(inputchar1) + "s");
			System.out.println("s" + String.valueOf(inputchar2) + "s");
		}
		
		if (result) {
			System.out.println(inputStr1 + " and " + inputStr2 + " are anagrams");
		} else {
			System.out.println(inputStr1 + " and " + inputStr2 + " are not anagrams");
		}
	}

	private static void toggleWordStringEx(String input) {
		String[] inputArray = input.split("\\s");
		StringBuffer sb = new StringBuffer();
		
		for (String inputStr : inputArray) {
			
			char[] newchar = new char[inputStr.length()];
			for (int i = 0; i< inputStr.length(); i++) {
				if (i==0) {
					newchar[i] = inputStr.toLowerCase().charAt(i);
					continue;
				}
				newchar[i] = inputStr.toUpperCase().charAt(i);
			}
			sb.append(String.valueOf(newchar) + " ");
		}
		
		System.out.println(sb.toString().trim());
	}

	private static void reverseWordStringEx(String input) {
		String[] inputStr = input.split("\\s");
		String resultStr = "";
		
		for (String inputSubStr: inputStr) {
			char[] inputchar = inputSubStr.toCharArray();
			char[] resultchar = new char[inputchar.length];
			
			for (int i = inputchar.length - 1, j = 0; i >= 0; i--, j++) {
				resultchar[j] = inputchar[i];
			}
			
			resultStr += String.valueOf(resultchar) + " ";
		}
		
		System.out.println(resultStr.trim());
	}

	private static void capitalizeString(String input) {
		String[] splitArray = input.split(" ");
		String resultStr = "";
		
		for (int i = 0; i < splitArray.length; i++) {
			String splittedString = String.valueOf(splitArray[i]);
			char[] newchar = new char[splittedString.length()];
			newchar[0] = splittedString.toUpperCase().charAt(0);
			
			for (int j = 1; j < splittedString.length(); j++) {
				newchar[j] = splittedString.charAt(j);
			}
			
			resultStr = resultStr + " " + String.valueOf(newchar);
		}
		
		
//		System.out.println(Arrays.toString(splitArray));
		System.out.println("Result: "+ resultStr.trim());
		
		/*String words[]=input.split("\\s");
		String capitalizeWord = "";
		
		for (String word : words) {
			String firstString = word.substring(0, 1);
			String afterString = word.substring(1);
			capitalizeWord += firstString.toUpperCase() + afterString + " ";
		}
		
		System.out.println(capitalizeWord.trim());*/
	}

	private static void palindromeStringEx(String input) {
		/*Another Way:
		1st way:
		StringBuilder sb = new StringBuilder(input);
		String resultStr = sb.reverse().toString();
		
		2nd way:
		char[] inputArray = input.toCharArray();
		String result = "";
		for (int i = inputArray.length-1; i >= 0; i--) {
			result += inputArray[i];
		}
		System.out.println(result);*/
		
		String resultStr = reverseStringEx(input);
		if (input.equalsIgnoreCase(resultStr)) {
			System.out.println("The given string " + input + " is Palindrome: " + resultStr);
		} else if (!input.equalsIgnoreCase(resultStr)) {
			System.out.println("The given string " + input + " is not Palindrome: " + resultStr);
		}
	}

	private static String reverseStringEx(String input) {
		char[] originalChar = input.toCharArray();
		char[] newchar = new char[originalChar.length];
		
		for (int i = originalChar.length-1, j = 0; i >= 0; i--, j++) {
			newchar[j] = originalChar[i];
		}
		
		return String.valueOf(newchar);
	}

}
