package general.ex.abstraction;

public class EncapsulationEx {

	public static void main (String args[]) {
		EncapsulationStudentEx studentEx = new EncapsulationStudentEx();
		studentEx.setDepartment("Computer Science");
		System.out.println("EncapsulationEx.main()... " + studentEx.getDepartment());
		System.out.println("EncapsulationEx.main()... " + studentEx.getName());
		System.out.println("EncapsulationEx.main()... " + studentEx.getSubject1());
	}
}
