package general.inheritance.ex;

public class FirstHierarchicalInheritance extends SecondHierarchicalInheritance {

	public String firstHierarchicalMethod1() {
		return "FirstHierarchicalMethod1()";
	}
	
	protected String FirstHierachicalMethod2() {
		System.out.println("Private method of FirstHierarchical method also available here: " + firstHierarchicalMethod3());
		
		System.out.println("\nSecondHierarchical method call from FirstHierarchicalMethod2: " + secondHierarchicalMethod2());
		return "FirstHierarchicalMethod2()";
	}
	
	private String firstHierarchicalMethod3() {
		return "FirstHierarchicalMethod3()";
	}
}
