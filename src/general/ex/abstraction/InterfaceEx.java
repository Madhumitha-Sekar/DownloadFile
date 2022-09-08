package general.ex.abstraction;

public class InterfaceEx {

	public static void main(String args[]) {
		basicInterfaceMethod();
		inheritanceInterfaceMethod();
		nestedInterfaceMethod();
	}

	private static void basicInterfaceMethod() {
		CommonInterfaceEx common = new BasicInterfaceClass2();
		common.print();
		System.out.println("InterfaceEx.basicInterfaceMethod()... " + common.defMethodEx());
		System.out.println("InterfaceEx.basicInterfaceMethod()... " + CommonInterfaceEx.staticMethodEx());

		/* BasicInterfaceClass2 basicEx = new BasicInterfaceClass2();
		 basicEx.print(); 
		 basicEx.show(); 
		 basicEx.defMethodEx(); */
	}

	private static void inheritanceInterfaceMethod() {
		InheritanceInterfaceClass inherit = new InheritanceInterfaceClass();
		inherit.inheritInterfaceMethod1();
		inherit.inheritInterfaceMethod2();
	}

	private static void nestedInterfaceMethod() {
		NestedInterfaceClass nested = new NestedInterfaceClass();
		nested.nestedB_Method();
	}
}

interface showable {
	void show();
}

interface inheritanceInterface1 {
	void inheritInterfaceMethod1();
}

interface inheritanceInterface2 extends inheritanceInterface1 {
	void inheritInterfaceMethod2();
}

class BasicInterfaceClass1 implements CommonInterfaceEx, showable {

	public BasicInterfaceClass1() {
		System.out.println("BasicInterfaceClass1.BasicInterfaceClass1() constructor invoked... ");
	}

	@Override
	public void print() {
		System.out.println("BasicInterfaceClass1.print()... Details are printed successfully... ");
	}

	@Override
	public void show() {
		System.out.println("BasicInterfaceClass1.show()... Details are shown in console... ");
	}

}

class BasicInterfaceClass2 implements CommonInterfaceEx, showable {
	@Override
	public void print() {
		System.out.println("BasicInterfaceClass2.print()... Details are printed successfully... ");
	}

	@Override
	public void show() {
		System.out.println("BasicInterfaceClass2.show()... Details are shown in console... ");
	}
}

class InheritanceInterfaceClass implements inheritanceInterface2 {

	@Override
	public void inheritInterfaceMethod1() {
		System.out.println("InheritanceInterfaceClass.inheritInterfaceMethod1()... ");
	}

	@Override
	public void inheritInterfaceMethod2() {
		System.out.println("InheritanceInterfaceClass.inheritInterfaceMethod2()... ");
	}

}

interface nestedA {
	void nestedA_Method();

	interface nestedB {
		void nestedB_Method();
	}
}

class NestedInterfaceClass implements nestedA.nestedB {

	@Override
	public void nestedB_Method() {
		System.out.println("NestedInterfaceClass.nestedB_Method()...");
	}

}