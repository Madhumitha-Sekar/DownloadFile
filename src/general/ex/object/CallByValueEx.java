package general.ex.object;

public class CallByValueEx {

	int data = 50;
	
	public void change(int data) {
		data = data + 100;
	}
	
	public void change1(CallByValueEx ex) {
		ex.data = ex.data + 100;
	}
	public static void main (String args[]) {
		// Call by Value Example
		CallByValueEx ex = new CallByValueEx();
		System.out.println("Before changing: " + ex.data);
		ex.change(300);
		System.out.println("After changing: " + ex.data);
		
		// Call By Reference Example
		CallByValueEx ex1 = new CallByValueEx();
		System.out.println("Before changing: " + ex1.data);
		ex.change1(ex1);
		System.out.println("After changing: " + ex1.data);
	}
}
