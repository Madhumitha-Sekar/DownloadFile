package general.ex.object;

public class ReflectionAPIEx {

	public static void main(String[] args) {
		 newInstanceEx1();
//		newInstanceEx();
	}

	private static void newInstanceEx() {
		try {
			Class c = Class.forName("ReflectionAPIEx");
			ReflectionAPIEx rfAPIEx = (ReflectionAPIEx) c.newInstance();
			rfAPIEx.sampleMessage();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private static void newInstanceEx1() {
		try {
			ReflectionAPIEx ee = ReflectionAPIEx.class.newInstance();
			System.out.println(ee);
			ee.sampleMessage();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void sampleMessage() {
		System.out.println("Hello java");
	}

}
