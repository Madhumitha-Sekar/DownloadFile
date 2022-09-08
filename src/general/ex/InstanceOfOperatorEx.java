package general.ex;

public class InstanceOfOperatorEx {

	public static void main(String args[]) {
		InstanceOfSimple1 simple1 = new InstanceOfSimple1();
		simple1.test();

		InstanceOfSimple2 s2 = new InstanceOfSimple2();
		InstanceOfCommonClass simple2 = new InstanceOfSimple2();
		s2.test(simple2);

		Printable p = new B();
		Call c = new Call();
		c.invoke(p);
	}
}

class InstanceOfCommonClass {

}

class InstanceOfSimple1 extends InstanceOfCommonClass {
	public void test() {
		InstanceOfCommonClass simple2 = new InstanceOfCommonClass();
		if (simple2 instanceof InstanceOfCommonClass) {
			System.out.println("InstanceOfSimple1 method... InstanceOfSimple2 is: " + true);
		} else {
			System.out.println("InstanceOfSimple1 method... Else InstanceOfSimple2 is: "
					+ (simple2 instanceof InstanceOfCommonClass));
		}
	}
}

class InstanceOfSimple2 extends InstanceOfCommonClass {
	public void test(InstanceOfCommonClass simple2) {
		if (simple2 instanceof InstanceOfSimple2) {
			InstanceOfSimple2 s2 = (InstanceOfSimple2) simple2; // downcasting
			System.out.println("The value of s2 is: " + s2);
		}
	}
}

interface Printable {
}

class A implements Printable {
	void test() {
		System.out.println("A.test() method invoked... ");
	}
}

class B implements Printable {
	void test() {
		System.out.println("B.test() method invoked... ");
	}
}

class Call {
	public void invoke(Printable p) {
		if (p instanceof A) {
			A a = (A) p;
			a.test();
		} else if (p instanceof B) {
			B b = (B) p;
			b.test();
		}
	}
}