package abstractt.interfacee.ex;

public class ExAbstract {

	public static void main(String[] args) {
		Bike bike = new Honda();
		bike.run();
		bike.changeGear();
		
		Honda honda = new Honda();
		honda.run();
		honda.changeGear();
	}

}

interface TwoWheeler {
	String a();
	String b();
	String c();
	String d();
}

abstract class Bike implements TwoWheeler {
	public String bikeVariable1 = "Light";
	protected String bikeVariable2 = "Engine";
	private String bikeVariable3 = "Break";

	public Bike() {
		System.out.println("Bike is created...");
	}

	abstract void run();

	public void changeGear() {
		System.out.println("gear changed... " + bikeVariable3);
	}
	
	public String c() {
		return "c";
	}
}

class Honda extends Bike implements TwoWheeler {
	public String hondaVariable1 = "Light";
	protected String hondaVariable2 = "Engine";
	private String hondaVariable3 = "Honda Break";
	
	@Override
	void run() {
		System.out.println("running safely..." + hondaVariable3);
	}

	@Override
	public String a() {
		return "a";
	}

	@Override
	public String b() {
		return "b";
	}

	@Override
	public String d() {
		return "c";
	}

}
