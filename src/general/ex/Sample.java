package general.ex;

import java.io.InputStream;


public class Sample {

	public static void main(String[] args) {
		systemMethod();
	}

	private static void systemMethod() {
		 // Printing Name of the system property 
        System.out.println("user.dir: "+System.getProperty("user.dir")); 
  
        // Printing 'name of Operating System' 
        System.out.println("os.name: "+System.getProperty("os.name")); 
  
        // Printing 'JAVA Runtime version' 
        System.out.println("version: "+System.getProperty("java.runtime.version" )); 
  
		System.out.println("System test... System.getProperty(user.dir)... " + System.getProperty("user.dir"));
		System.out.println("System test... System.getProperty(user.dir)... " + System.getProperty("user.dirr", "usesss"));
		
		
		InputStream s = Sample.class.getResourceAsStream("/" + "test.properties");
		System.out.println("InputStream... " + s);
	}

}
 