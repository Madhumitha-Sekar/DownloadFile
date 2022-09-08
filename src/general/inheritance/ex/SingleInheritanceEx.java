package general.inheritance.ex;

public class SingleInheritanceEx extends FirstSingleInheritanceEx {

	@Override
	public String singleMethod1() {
		// protected or private --> Cannot reduce the visibility of the
		// inherited method from FirstSingleInheritanceEx
		return "SingleMethod1 from SingleInheritanceEx";
	}

	@Override
	protected String singleMethod2() {
		// private --> Cannot reduce the visibility of the inherited method from
		// FirstSingleInheritanceEx
		return "singleMethod2 from SingleInheritanceEx";
	}

	public static void main(String[] args) {
		SingleInheritanceEx inherit = new SingleInheritanceEx();
		System.out.println("SingleInheritance: " + inherit.singleMethod1());
		System.out.println("SingleInheritance: " + inherit.singleMethod2());
		System.out.println("Completed... ");
	}

}