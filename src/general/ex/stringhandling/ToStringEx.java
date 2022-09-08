package general.ex.stringhandling;

public class ToStringEx {

	private Integer rollno;
	private String name;
	private Integer age;
	
	public ToStringEx(Integer rollno, String name, Integer age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[" + rollno + ", " + name + ", " + age + "]";
	}
	
	public static void main(String[] args) {
		ToStringEx ex1 = new ToStringEx(1011, "Raj", 20);
		ToStringEx ex2 = new ToStringEx(1015, "Kumar", 21);
		
		System.out.println(ex1);
		System.out.println(ex2);
	}

}
