package general.ex.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {

	public static void main(String[] args) {
		
//		basicRegexEx();
//		regexCharacterEx();
//		regexQuantifiersEx();
		regexMetaCharEx();
		regexQuizEx();
		
	}

	private static void regexQuizEx() {
		System.out.println("[a-zA-Z0-9]{7}: " + Pattern.matches("[a-zA-Z0-9]{7}", "karan26")); // {7} means six letters only allowed
		System.out.println("[789]{1}[0-9]{9}: " + Pattern.matches("[789]{1}[0-9]{9}", "9328283028")); // 10 digits only allowed, {9} means 9 digit/letter
		System.out.println("[789][0-9]{9}: " + Pattern.matches("[789][0-9]{9}", "9282837472")); 
		System.out.println("[789]{1}\\d{9}: " + Pattern.matches("[789]{1}\\d{9}", "9838374729")); // '\d' represents the digits(allowed digits only)
	}

	private static void regexMetaCharEx() {
		System.out.println("\\d: " + Pattern.matches("\\d", "2")); // '\d' means only digit, one digit only allowed
		System.out.println("\\D: " + Pattern.matches("\\D", "s")); // '\D' means non-digit('^\d'), one letter only allowed
		System.out.println("\\D*: " + Pattern.matches("\\D*", "lkj")); //'\D*'non-digit and letters allowed zero or more times
		System.out.println("\\s: " + Pattern.matches("\\s", " ")); // '\s' means whitespace char (short for [\t\n\x0B\f\r)
		System.out.println("\\S: " + Pattern.matches("\\S", "a")); // '\S' means non-whitespace char (short for [^/s])
		System.out.println("\\w: " + Pattern.matches("\\w", "s")); // '\w' means word char (short for [a-zA-Z0-9])
		System.out.println("\\W: " + Pattern.matches("\\W", " ")); // '\W' means non-word char (short for [^\w])
//		System.out.println("\\b: " + Pattern.matches("table\\b", "tablefortable tableword")); // '\b' means word boundary
		Matcher matcher = Pattern.compile("\\btable").matcher("tablefortable tableworld");
		while (matcher.find()) {
			System.out.println("Pattern start: " + matcher.start() + " Pattern end: " + matcher.end());
		}
		System.out.println("\\B: " + Pattern.matches("\\B", "")); // '\B' means non-word boundary
	}

	private static void regexQuantifiersEx() {
		System.out.println("X?: " + Pattern.matches("X?", "X")); // X occurs once or not at all
		System.out.println("X+: " + Pattern.matches("X+", "XX")); // X occurs once or more times
		System.out.println("X*: " + Pattern.matches("X*", "XXXXXX")); // X occurs zero or more times
		System.out.println("X{n}: " + Pattern.matches("X{3}", "XXX")); // X occurs n-->3 times only
		System.out.println("X{n,}: " + Pattern.matches("X{2,}", "XXXXX")); // X occurs n--> 2 times or more times
		System.out.println("X{y,z}: " + Pattern.matches("X{3,5}", "XXXXX")); // X occurs atleast 3 times but less than 5 times
	}

	private static void regexCharacterEx() {
		System.out.println("[abc]: " + Pattern.matches("[abc]", "b")); // Only one letter allowed (a or b or c)
		System.out.println("[^abc]: " + Pattern.matches("[^abc]", "s")); // Only one letter allowed, that is not equivalent to (a or b or c)
		System.out.println("[a-zA-Z]: " + Pattern.matches("[a-zA-Z]", "s")); // Only one letter allowed (small or caps letter anything)
		System.out.println("[a-d[m-p]]: " + Pattern.matches("[a-d[m-p]]", "z")); // a to d (or) m to p letter only allowed
		System.out.println("[a-z&&[def]]: " + Pattern.matches("[a-z&&[def]]", "d")); // Except d or e or f, nothing is allowed
		System.out.println("[a-z&&[^bc]]: " + Pattern.matches("[a-z&&[^de]]", "e")); // Except d or e,everything is allowed (a-c, f-z)
		System.out.println("[a-z&&[^m-p]]: " + Pattern.matches("[a-z&&[^m-p]]", "b")); // Except m to p, everything is allowed (a-l, q-z)
	}

	private static void basicRegexEx() {
		Pattern pattern = Pattern.compile(".s.");
		Matcher matcher = pattern.matcher("asz");
		boolean boolResult = matcher.matches();
		System.out.println("Basic pattern result: " + boolResult);
		
		boolean bResult = Pattern.matches(".s", "as");
		System.out.println("2nd basic pattern result: " + bResult);
		
	}

}
