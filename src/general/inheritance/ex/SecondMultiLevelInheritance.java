package general.inheritance.ex;

public class SecondMultiLevelInheritance {

	public String secondMultiLevelMethod1() {
		return "SecondMultiLevelMethod1()";
	}
	
	protected String secondMultiLevelMethod2() {
		System.out.println("Private method also available here: " + secondMultiLevelMethod3());
		return "SecondMultiLevelMethod2()";
	}
	
	private String secondMultiLevelMethod3() {
		return "SecondMultiLevelmethod3()";
	}
	
}
