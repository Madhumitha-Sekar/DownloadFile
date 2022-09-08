package general.inheritance.ex;

public class HierarchicalInheritanceEx extends SecondHierarchicalInheritance {

	public static void main(String[] args) {
		HierarchicalInheritanceEx hierarchicalInherit = new HierarchicalInheritanceEx();
		System.out.println(hierarchicalInherit.secondHierachicalMethod1());
		System.out.println(hierarchicalInherit.secondHierarchicalMethod2());
		System.out.println("HierarchicalInheritanceEx method completed... \n");
		
		FirstHierarchicalInheritance firstInherit = new FirstHierarchicalInheritance();
		System.out.println(firstInherit.FirstHierachicalMethod2());
		System.out.println(firstInherit.firstHierarchicalMethod1());
		System.out.println(firstInherit.secondHierachicalMethod1());
		System.out.println(firstInherit.secondHierarchicalMethod2());
		System.out.println("FirstHierarchicalInheritance method completed... \n");
	}

}
