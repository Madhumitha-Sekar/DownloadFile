package general.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopEx {

	protected LoopEx() {
		System.out.println("LoopEx constructor invoked... ");
	}

	public static void main(String args[]) {
		// DecisionMakingStatementEx();
		LoopStatementEx();
		// JumpStatementsEx();

	}

	private static void LoopStatementEx() {
		// simpleForStatementEx();
		// pyramidEx();
//		forEachStatementEx("");
//		whileStatementEx();
		doWhileStatementEx();
	}
	
	private static void doWhileStatementEx() {
		int i = 1;
		do {
			System.out.println("The value of i in dowhile loop: " + i);
			i++;
		} while(i <=10);
	}

	private static void whileStatementEx() {
		int i = 0;
		while (i < 20) {
			System.out.println("The value of i is : " + i);
			i += 5;
		}
	}

	 /** For Each statement example */ 
	private static void forEachStatementEx(String name) {
		int[] arrList = { 12, 25, 35, 45 };
		for (int arr : arrList) {
			System.out.println("The value of arr forEach statement is : " + arr);
		}
		
		byte[] byteList = {10, 15, 25};
		for (byte byteVariable : byteList) {
			System.out.println("The value of byteVariable is : " + byteVariable);
		}
		
		String[] stringList = {"arjun" , "Hussain", "Sidharth"};
		for (String str : stringList) {
			System.out.println("The string value of str is: " + str);
		}
	}

	private static void pyramidEx() {
		// pyramidExample1();
		pyramidExample2();
	}

	private static void pyramidExample2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pyramidExample1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void simpleForStatementEx() {
		int i;
		for (i = 0; i <= 5; i++) {
			System.out.println("The value of i is: " + i);
		}
	}

	private static void DecisionMakingStatementEx() {
		simpleIfStatementEx();
		ifElseIfStatementEx();
		switchStatementEx();
	}

	private static void switchStatementEx() {
		System.out.println("SwithcStatementEx() started 1... ");
		// float f = 0.0f; // Only int values, string or enum values only
		// permitted.
		// Float not permitted in switch stt
		final int i = 1;
		switch (i) {
		case 1:
			System.out.println("The value is:" + 1);
			break;
		case 2:
			System.out.println("The value is: " + 2);
			break;
		default:
			System.out.println("Default value for Switch...");
		}

		System.out.println("SwithcStatementEx() started 2... ");
		String name = "Ravi";
		switch (name) {
		case "Raghu":
			System.out.println(name);
			break;
		case "Sasi":
			System.out.println(name);
			return;
		case "Ravi":
			System.out.println(name);
			break;
		case "kumar":
			System.out.println(name);
			break;
		default:
			System.out.println("Default value is " + name);
		}
		System.out.println("SwithcStatementEx() started 2 ended... ");
	}

	private static void ifElseIfStatementEx() {
		System.out.println("IfElseIfStatementEx started...");
		int number = 20;
		if (number > 30) {
			System.out.println("The value of num is: 30");
		} else if (number > 40) {
			System.out.println("The value of num is: 10(1) ");
		} else if (number < 25) {
			System.out.println("The value of num is: 10(2)");
		} else {
			System.out.println("The default value is: same " + number);
		}
	}

	private static void simpleIfStatementEx() {
		System.out.println("SimpleIfStatementEx started...");

		String name = "Ravi";
		if ("Ravi".equals(name) || "Rajesh".equals(name)) {
			System.out.println("The value of name is " + name);
		}
	}

	/** Jump statements example (Break and Continue) **/
	private static void JumpStatementsEx() {
		breakEx();
		continueEx();
		/* Additional check for Protected access specifier */
//		tempTestedEx();
	}

	/* Additional check for Protected access specifier */
	protected static void tempTestedEx() {
		System.out.println("tempTestedEx");
	}
	
	/* Covariant return type example */
	public LoopEx check() {
		return this;
	}
	
	/** Continue statement example **/
	private static void continueEx() {
		System.out.println("Continue statement used inside the 'for loop' example: ");
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println("The value of i: " + i);
		}
	}

	/** Break statement example **/
	public static void breakEx() {
		System.out.println("Break statement used inside the 'for loop' example: ");
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("The value of i: " + i);
		}
		/**
		 * Break statement - We could able to use only inside the 'for loop' and
		 * 'switch', even not able to use on 'if' statement (Alone 'if'
		 * condition - means outside of the for loop)
		 **/
		/* break; --> Got Compile time error in this line */
	}
}
