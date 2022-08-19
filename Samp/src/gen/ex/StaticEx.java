package gen.ex;

public class StaticEx {

	int a = 10;
	
	static int b = 20;
	
	static {
		System.out.println("Static block executed... ");
		b = 22;
	}
	
	public static void main(String[] args) {
//		System.out.println("The value of a: " + a);
		System.out.println("Main method executed... ");
		System.out.println("The value of b(static block): " + b);
		
		StaticEx sx = new StaticEx();
		System.out.println("The value of a: " + sx.a);
//		sx.nonStaticMethod();
		
		
		
	}

	public String nonStaticMethod() {
		super.toString();
		System.out.println(this);
		System.out.println(this.a);
		return "";
	}
}
