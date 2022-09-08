package general.ex;

public class OuterClassEx {

	private static String outerFirstValue = "OuterFirst";
	public static String outerSecondValue = "OuterSecond";

	public static void main(String[] args) {
		outerFirstMethod();
		outerSecondMethod();
		
		// Inner method calling (Member Inner class)
		OuterClassEx outer = new OuterClassEx();
		OuterClassEx.InnerClassEx inner = outer.new InnerClassEx();
		inner.message();
		
		// Inner method calling
		/*InnerClassEx.innerFirstMethod();
		System.out.println(InnerClassEx.innerFirstValue);*/
		
		// Local Inner class method calling
		OuterClassEx outer2 = new OuterClassEx();
		outer2.display();
	}

	private void display() {
		String localInnerString = "Local_Inner_String";

		class Local {
			public void msg() {
				System.out.println("Dispaly method is executed... value of 'Local Inner class' private value: "
						+ localInnerString + "; Outer class instance variable: " + outerFirstValue);
			}
		}
		
		Local local = new Local();
		local.msg();
	}

	public static void outerSecondMethod() {
		System.out.println("outerSecondMethod for public... " + outerSecondValue);
	}

	private static void outerFirstMethod() {
		System.out.println("OuterFirstMethod for Private... " + outerFirstValue);
	}

	public class InnerClassEx {
		public void message() {
			System.out.println("message() method is executed... Value of 'OuterFirst(Outer class)' private value: " + outerFirstValue);
		}
	}
	
	/*static class InnerClassEx {
		private static String innerFirstValue = "InnerFirst";
		public static String innerSecondValue = "InnerSecond";

		public void innerMainMethod(String[] args) {
			innerFirstMethod();
			innerSecondMethod();

			// Outer method calling
			outerFirstMethod();
			System.out.println(outerFirstValue);
			outerSecondMethod();
			System.err.println(outerSecondValue);
		}

		public static void innerSecondMethod() {
			System.out.println("innerSecondMethod for public... " + innerSecondValue);
		}

		private static void innerFirstMethod() {
			System.out.println("innerFirstMethod for Private... " + innerFirstValue);
		}
	}*/

}
