package gen.ex;

import java.util.Calendar;
import java.util.Date;

import file.ex.OpenFileExample;

public class Sampl extends OpenFileExample {

	public static void main(String[] args) {
		System.out.println("Hi Siva...");
		System.out.println(System.getProperty("java.version"));
		System.out.println("Add days: " + addDays(new Date(), -7));
	}

	public static Date addDays(Date inputDate, int numOfDays) {
		OpenFileExample oe = new OpenFileExample();
		oe.testProtectedPurpose();
		Sampl s = new Sampl();
		s.testProtectedPurpose();
		
		try {
			ObjectStudentEx os = new ObjectStudentEx();
			os.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inputDate);
		cal.add(Calendar.DATE, numOfDays); // minus numb would decrement days
		return cal.getTime();
	}
	
}
