package gen.ex;

public class SuperEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.action();
	}

}


class Animal {
	public void eat() {
		System.out.println("Animal Eating...");
	}
	
	public void bark() {
		System.out.println("Animal Barking...");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Eating bread...");
	}
	
	public void bark() {
		System.out.println("Barking...");
	}
	
	public void action() {
		bark();
		super.eat();
	}
}
