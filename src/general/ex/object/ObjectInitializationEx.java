package general.ex.object;

class Student {
	int id;
	String name;
	
	public void setStudValue (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void getDisplay() {
		System.out.println("Value of id: " + id + " and name: " + name);
	}
}

public class ObjectInitializationEx {

	public static void main(String args[]) {
//		initializeObjectThroReference();
		initializeObjectThroMethod();
	}

	private static void initializeObjectThroMethod() {
		Student s1 = new Student();
		s1.setStudValue(1000, "siva");
		Student s2 = new Student();
		s2.setStudValue(2000, "Nivii");
		s1.getDisplay();
		s2.getDisplay();
	}

	private static void initializeObjectThroReference() {
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println("Before initialize S1: Id - " + s1.id);
		System.out.println("Before initialize S1: Name - " + s1.name);
		System.out.println("Before initialize S2: Id - " + s2.id);
		System.out.println("Before initialize S2: Name - " + s2.name);
		s1.id = 100;
		s1.name = "Mani";
		s2.id = 200;
		s2.name = "Nivi";
		System.out.println("After initialize S1: Id - " + s1.id);
		System.out.println("After initialize S1: Name - " + s1.name);
		System.out.println("After initialize S2: Id - " + s2.id);
		System.out.println("After initialize S2: Name - " + s2.name);
	}
}
