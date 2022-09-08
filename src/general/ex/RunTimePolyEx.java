package general.ex;

public class RunTimePolyEx {

	public static void main(String[] args) {
		RunTimePolyParentEx obj = new RunTimePolyChildEx();
		obj.display();
		obj.print();
	}

}

class RunTimePolyParentEx {
	public void display() {
		System.out.println("Super class overriding Method");
	}

	public void print() {
		System.out.println("Super class overridden print Method");
	}
}

class RunTimePolyChildEx extends RunTimePolyParentEx {

	public void display() {
		System.out.println("Sub class overriding Method");
	}

	public void print() {
		System.out.println("Sub class overriding print Method");
	}
}
