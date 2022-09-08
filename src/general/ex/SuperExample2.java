package general.ex;

public class SuperExample2 extends SuperExample1 {

	public String color = "Green";
	private String level;
	
	public SuperExample2(Integer id, String name, String level) {
		super(id, name); // validate Super Constructor example
		this.level = level;
		System.out.println("SuperExample2 constructor invoked...");
	}
	
	public SuperExample2(String ex) {
		super();
		System.out.println("SuperExample2 constructor invoked...");
	}
	
	public void validateSuperVariable() {
		System.out.println(color);
		System.out.println(super.color);
	}

	public void validateSuperMethod() {
		System.out.println(super.validateSuperMethod1());
		System.out.println(validateSuperMethod2());
	}
	
	@Override
	public String validateSuperMethod1() {
		return "validateSuperMethod1.. Specific eating method...";
	}
	
	public String validateSuperMethod2() {
		return "validateSuperMethod2... Specific walking method...";
	}

	public void displayValue() {
		System.out.println("ID: " + id + " NAME: " + name + " LEVEL: " + level);
	}

}
