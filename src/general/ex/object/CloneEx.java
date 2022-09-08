package general.ex.object;

public class CloneEx implements Cloneable {

	public CloneEx() {}
	
	int sid;
	String sname;
	
	public CloneEx(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
		
	String name = "System";
	
	public static void main(String[] args) {
		/*CloneEx obj1 = new CloneEx();
		CloneEx obj2 = new CloneEx();
		System.out.println(obj2.name);
		try {
			obj2 = (CloneEx) obj1.clone();
			System.out.println("Obj1 hashcode() " + obj1.hashCode());
			System.out.println("Obj1 tostring() " + obj1.toString());
			
			System.out.println("Obj2 hashcode() " + obj2.hashCode());
			System.out.println("Obj2 tostring() " + obj2.toString());
//			System.out.println(obj2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}*/
		
		new ClonePracticalEx(10, "Rakesh");
	}

}

class ClonePracticalEx {
	public ClonePracticalEx(int Sid, String Sname) {
		try {
			CloneEx ex1 = new CloneEx(Sid, Sname);
			// CloneEx ex2 = ex1; // Shallow copy
			CloneEx ex2 = (CloneEx) ex1.clone(); // Deep copy
			System.out.println("ex2 Object: " + ex2.sid + " " + ex2.sname + " " + ex1.hashCode() + " " + ex2.hashCode());
			ex1.sid = 12;
			System.out.println("ex2 Object: " + ex2.sid + " " + ex2.sname + " " + ex1.hashCode() + " " + ex2.hashCode());
		} catch (CloneNotSupportedException e) {

		}
	}
}
