package general.ex.stringhandling;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;


public class StringConcatenationEx {

	public static void main(String args[]) {
		usingPlusOperatorMethod();
		concateMethod();
		stringJoinMethod();
		stringJoinerMethod();
	}
	
	private static void stringJoinerMethod() {
		StringJoiner str = new StringJoiner(",");
		str.add("Java");
		str.add("is");
		str.add("always number one");
		System.out.println(str.toString());
		
		List<String> strList = Arrays.asList("abc", "kkdl", "skd");
		String resultStr = strList.stream().collect(Collectors.joining("# "));
		System.out.println(resultStr);
	}
	
	private static void stringJoinMethod() {
		String s1 = "Harish";
		String s2 = "Nitish";
		String s3 = "Kiri";
		System.out.println(String.join("   ", s1,s3,s2));
	}
	
	private static void concateMethod() {
		String s1 = "Mahesh";
		s1 = s1.concat("Boobathy").concat("Tennis");
		System.out.println(s1);
//		String s3 = s1.concat("sdf1").concat(null); // NullPointerException
		
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder(" World");
		StringBuilder sb3 = sb1.append(sb2);
		System.out.println(sb3);
		
		String s5 = "Aloe";
		System.out.println(s5.intern());
		System.out.println(String.format("%s %s", s1,s5));
		
	}

	private static void usingPlusOperatorMethod() {
		String str1 = "Ravi" + " Shankar";
		System.out.println(str1);
		
		String str2 = 60 + 25 + "middle" + 30 + 40;
		System.out.println(str2);
		
		String s1 = new StringBuilder().append("John").append(" Henry").toString();
		char c[] = new char[5];
		c[0] = 'a';
		c[1] = 'b';
		String s2 = s1.valueOf(c);
		System.out.println(s2 + " dd " + s1);
		StringBuilder s4 = new StringBuilder("a").append("b");
		s4.append(true).append('e').append(new StringCompareEx());
		System.out.println(s4);
	}
}
