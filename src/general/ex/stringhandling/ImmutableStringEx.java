package general.ex.stringhandling;

/*final class ImmutableStringDemo {

	final String pancardNumber;

	public ImmutableStringDemo(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

}*/

public class ImmutableStringEx {

	public static void main(String args[]) {
		ImmutableStringDemo demo = new ImmutableStringDemo("PAN0842");
		System.out.println(demo.getPancardNumber());
	}
}

/**
 * ImmutableStringDemo class is created without final class, the below is the
 * proof of immutable class is not working fine
 *
 */
/*class ImmutableStringEx extends ImmutableStringDemo {
	
	String pancardNumber;
	
	public ImmutableStringEx(String pancardNumber) {
		super(pancardNumber);
		this.pancardNumber = pancardNumber;
	}

	@Override
	public String getPancardNumber() {
		return pancardNumber;
	}
	
	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}
	
	public static void main(String args[]) {
		ImmutableStringEx ex = new ImmutableStringEx("dds");
		ImmutableStringDemo strDemo = (ImmutableStringDemo) ex;

		System.out.println(strDemo.getPancardNumber());
		ex.setPancardNumber("PAN00344");
		System.out.println(strDemo.getPancardNumber());
	}
}*/
