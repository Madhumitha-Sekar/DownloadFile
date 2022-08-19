package gen.ex;

class Bike {
	public final void run() {
		System.out.println("Bike running...");
	}
}

public class FinalEx extends Bike {
	/** Error occured: Cannot override the final method from Bike
	 * public void run() {
	   System.out.println("FinalEx running");
	}**/

	public static void main(String[] args) {
		FinalEx h = new FinalEx();
		h.run();
	}
}