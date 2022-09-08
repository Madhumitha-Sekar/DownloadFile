package general.ex.object;

public class MathClassEx {

	public static void main(String args[]) {
		/*double x = 30;
		double y = 5;*/
		
		int x = 30;
		int y = 5;
		
		double a = 40;
		double b = Math.toRadians(a);
		double nanValue = Double.NaN;
		
		System.out.println("Maximum value: " + Math.max(x, y));
		System.out.println("Minimum value: " + Math.min(x, y));
		
		System.out.println("Square root value: " + Math.sqrt(4));
		System.out.println("ToRadians value: " + b);
		
		System.out.println("Absolute value: " + Math.abs(x));
		System.out.println("Round value: " + Math.round(30.4));
		System.out.println("Cube root value: " + Math.cbrt(x));
		System.out.println("Power value: " + Math.pow(x, 3));
		System.out.println("Find sign value: " + Math.signum(10));
		System.out.println("Find Integer value: " + Integer.signum(30));
		System.out.println("Find Integer value: " + Math.signum(nanValue));
		
		System.out.println("Ceil value: " + Math.ceil(40.1));
		System.out.println("Floor value: " + Math.floor(45.9));
		System.out.println("CopySign value: " + Math.copySign(-40, 35));// Copied the second param sign and print the first param value
		System.out.println("nextAfter value: " + Math.nextAfter(70, 60));
		System.out.println("nextUp value: " + Math.nextUp(59));
		System.out.println("Ramdom value: " + Math.random());
		
		
		System.out.println("AddExact value: " + Math.addExact(30, 80));
		System.out.println("IncrementExact value: " + Math.incrementExact(42));
		
		System.out.println("Degrees value: " + Math.toDegrees(17));
		
	}
}
