package general.ex.object;

public class CommandLineArgEx {

	public static void main(String args[]) {
		System.out.println("Execution started...");
//		simpleCommandLineArgEx(args);
		multipleCommandLineArgEx(args);
	}
	
	private static void simpleCommandLineArgEx(String[] args) {
		System.out.println("Second argument: " + args[1]);
		System.out.println("First argument: " + args[0]);
	}
	
	private static void multipleCommandLineArgEx(String args[]) {
		int count = 0;
		for (String argValue : args) {
			System.out.println("Arg " + count++ + ": " + argValue);
		}
	}
}
