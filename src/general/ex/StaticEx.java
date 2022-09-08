package general.ex;

public class StaticEx {

	public int id;
	public String name;
	public static String college = "Vellammal";
	
	public StaticEx(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Id: " + id + " Name: " + name + " College: " + college);
	}
	
	public static void change() {
		college = "Veltech";
	}
	

	/** Static block **/
	static {
		System.out.println("Static method always initialized before main method...");
	}
	
	public static void main (String[] args) {
		StaticEx ex1 = new StaticEx(100, "Ajith");
		StaticEx ex2 = new StaticEx(101, "Vijay");
		
		StaticEx.change();
		
		ex1.display();
		ex2.display();
	}
}
