package general.inheritance.ex;

public class MultiLevelInheritanceEx extends FirstMultiLevelInheritance {

	public static void main(String[] args) {
		MultiLevelInheritanceEx firstmultiInheritance = new MultiLevelInheritanceEx();
		System.out.println("MultiLevelInheritance: " + firstmultiInheritance.firstMultiLevelMethod1());
		System.out.println("MultiLevelInheritance: " + firstmultiInheritance.firstMultiLevelMethod2());
		System.out.println("MultiLevelInheritance: " + firstmultiInheritance.secondMultiLevelMethod1());
		System.out.println("MultiLevelInheritance: " + firstmultiInheritance.secondMultiLevelMethod2());
	}

}
