package general.inheritance.ex;

public class SecondHierarchicalInheritance {

	public String secondHierachicalMethod1() {
		return "SecondHierarchicalMethod1()";
	}
	
	protected String secondHierarchicalMethod2() {
		System.out.println("private method of second Hierarchical also avail here: " + secondHierarchicalMethod3());
		return "SecondHierarchicalmethod2()";
	}
	
	private String secondHierarchicalMethod3() {
		return "SecondHierarchicalMethod3()";
	}
}
