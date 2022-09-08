package general.ex.stringhandling;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertionEx {

	public static void main(String[] args) {
		stringToIntMethod("102");
		intToStringMethod(234);
		
		stringToDateMethd("05/12/2022");
	}

	private static void stringToDateMethd(String input) {
		Date dateResult = null;
		DateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
		
		try {
			dateResult = dateFormatter.parse(input);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("String to Date method: " + input + " -->   " + dateResult);
		
		
	}

	private static void intToStringMethod(int input) {
		System.out.println("Int to String convertion method: ");
		String firstResult = String.valueOf(input);
		System.out.println("String.valueOf() method: " + firstResult);
		
		String secondResult = Integer.toString(input);
		System.out.println("Integer.toString() method: " + secondResult);
		
		String thirdResult = String.format("int to String covert - String.format() method: %d", input);
		System.out.println(thirdResult);
	}

	private static void stringToIntMethod(String input) {
		Integer integerResult = Integer.valueOf(input);
		int intResult = Integer.parseInt(input);
		System.out.println(integerResult);
		System.out.println(intResult);
		
		/*String str = "hello";
		Integer result = Integer.valueOf(str); // NumberFormatException:
		System.out.println(result);*/
	}

}
