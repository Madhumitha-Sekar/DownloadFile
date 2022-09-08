package general.ex.abstraction;

public class EncapsulationStudentEx {

	private String name = "Dhoni";
	private String department;
	private Integer subject1;
	private Integer subject2;
	private float total;

	public String getName() {
		return name;
	}
	/*public void setName(String name) {
		this.name = name;
	}*/

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSubject1() {
		return subject1;
	}
	public void setSubject1(Integer subject1) {
		this.subject1 = subject1;
	}

	public Integer getSubject2() {
		return subject2;
	}
	public void setSubject2(Integer subject2) {
		this.subject2 = subject2;
	}

	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}

}