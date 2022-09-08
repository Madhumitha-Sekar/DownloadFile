package general.ex.abstraction;

public class AbstractEx {

	public static void main(String args[]) {
		basicAbstractMethod();
		shapeAbstractMethod();
		interfaceAbstractMethod();
	}

	private static void basicAbstractMethod() {
		CommonAbstractEx common = new BasicAbstractClass();
		common.run();
		System.out.println("AbstractEx.basicAbstractMethod().. bodyFit values is: " + common.bodyFit);
	}

	private static void shapeAbstractMethod() {
		ShapeAbstractClass common;

		common = new Rectangle();
		System.out.println("Shape type: " + common.draw() + " method invoked... ");
		common = new Circle();
		System.out.println("Shape type: " + common.draw() + " method invoked... ");
	}

	private static void interfaceAbstractMethod() {
		A a = new interfaceAbstractEx();
		a.a();
		a.b();
		a.c();
		a.d();
	}
	
}


class BasicAbstractClass extends CommonAbstractEx {
	public BasicAbstractClass() {
		System.out.println("BasicAbstractClass.BasicAbstractClass() constructor invoked... ");
	}
	
	@Override
	void run() {
		System.out.println("BasicAbstractClass.run() method invoked... ");
	}
}


abstract class ShapeAbstractClass {
	abstract String draw();
}

class Rectangle extends ShapeAbstractClass {
	@Override
	String draw() {
		return "Rectangle";
	}
}

class Circle extends ShapeAbstractClass {
	@Override
	String draw() {
		return "Circle";
	}
}

interface A {
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A {
	
	public void a() {
		System.out.println("B.a()");
	}
	
	void e() {
		System.out.println("B.e()");
	}
	
	abstract void f();
}

class interfaceAbstractEx extends B {

	@Override
	public void b() {
		System.out.println("interfaceAbstractEx.b()");
	}

	@Override
	public void c() {
		System.out.println("interfaceAbstractEx.c()");
	}

	@Override
	public void d() {
		System.out.println("interfaceAbstractEx.d()");
	}

	@Override
	void f() {
		System.out.println("interfaceAbstractEx.f()");
	}
	
}