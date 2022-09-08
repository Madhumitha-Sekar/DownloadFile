package general.ex;

public class OperatorEx {

	public static void main(String[] args) {
		unaryOperatorEx();
		arithmeticOperatorEx();
		shiftOperatorEx();
		assignmentOperatorEx();
	}

	
	/** Assignment operator examples **/
	private static void assignmentOperatorEx() {
		shiftTypecaseOperator();
	}



	private static void shiftTypecaseOperator() {
		System.out.println("Assignment ShiftTypecast ex:");
		short a = 10;
		short b = 20;
		a += b;
		System.out.println(a);
	}


	/** Shift examples **/
	private static void shiftOperatorEx() {
		leftshiftOperatorEx();
		rightshiftOperatorEx();
	}
	
	private static void rightshiftOperatorEx() {
		System.out.println("Rightshift ex: ");
		System.out.println(10>>2); // (10/2^2) = (10/4)  ==> 2
		System.out.println(50>>4); // (50/2^4) = (50/16) ==> 3 
	}

	private static void leftshiftOperatorEx() {
		System.out.println("Leftshift ex: ");
		System.out.println(10<<2); // (10 * 2^2) ==> 40
		System.out.println(15<<4); // (15 * 2^4) ==> 240  
	}


	/** Arithmetic examples **/
	private static void arithmeticOperatorEx() {
		System.out.println("Arithmetic expression example:");
		System.out.println("Arithmetic value: " + (6/3 * 10 + 12/6 * 21/7 - 3*1 + 5));
	}

	
	/** Unary examples **/
	private static void unaryOperatorEx() {
		unaryAdditionEx();
		unaryComplementEx();
	}

	private static void unaryComplementEx() {
		int a = 20;
		int b = -20;
		boolean c = true;
		
		System.out.println("Unary complement example: ");
		System.out.println("a value: " + ~a); // -21 (minus of total positive value which starts from 0) ==> (0 to 20 digit is totally 21 right, so thats why)
		// "a Values: " ==> 0,1,2,3,4,.. when reach 20th value, count the digit size from 0, it totally 21 
		System.out.println("b value: " + ~b); // 19 (positive of total minus, positive starts from 0) ==> (From 0 digit started, 20th values is 19 right, so thats why)
		// 'b value: " ==> 0,1,2,3,4,.. when reach 19th value, the count of digit size is 20, so it could be stopped on 19th place
		System.out.println("c value: " + !c);
	}

	private static void unaryAdditionEx() {
		int a = 20;
		int b = 20;
		
		System.out.println("Unary addition example: ");
		System.out.println("a value: " + (a++ + ++a)); // (20 + 22) ==> 42
		System.out.println("b value: " + (b++ + b++)); // (20 + 21) ==> 41
	}

}
