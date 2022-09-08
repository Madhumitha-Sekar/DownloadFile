package general.ex;

public class SuperExample1 {

	protected Integer id;
	protected String name;
	public String color = "Blue";
	
	public SuperExample1() {
		System.out.println("SuperExample1 constructor invoked...");
		return;
	}
	
	public SuperExample1(Integer id, String name) {
		System.out.println("SuperExample1 parameterized constructor invoked...");
		this.id = id;
		this.name = name;
	}
	
	public String validateSuperMethod1() {
		return "Common eating method...";
	}
}
