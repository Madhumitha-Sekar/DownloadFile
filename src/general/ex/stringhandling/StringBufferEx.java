package general.ex.stringhandling;

public class StringBufferEx {

	static String commonStr = "Sachin Tendulkar";
	
	public static void main(String args[]) {
		// roughExampleMethod(args);

		basicExample();
		appendExample();
		insertExample();
		replaceExample();
		deleteExample();
		reverseExample();
		ensureCapacityExample();
		charAtExample();
		substringExample();
	}

	private static void substringExample() {
		StringBuffer subStr = new StringBuffer();
		/*StringBuffer commonStrBuffer = new StringBuffer();
		commonStrBuffer.setLength(0);*/
		subStr.append(commonStr);
		System.out.println(subStr.substring(7)); // Tendulkar
		System.out.println(subStr.substring(10, 14)); // dulk
	}

	private static void charAtExample() {
		StringBuffer charAtStr = new StringBuffer();
		charAtStr.append(commonStr);
		char chStr = charAtStr.charAt(3); // It return the 'h' value in commonStr(Sachin Tendulkar)
		System.out.println("Retrieve the specified string based on index (charAt(index)): " + chStr);
		
		charAtStr.reverse();
		System.out.println("Reverse string result: " + charAtStr);
		System.out.println("Length of the string result: " + charAtStr.length());// Length is 16
	}

	private static void ensureCapacityExample() {
		StringBuffer capacityStr = new StringBuffer();
		capacityStr.append(commonStr);
		System.out.println("Capacity string result: " + capacityStr);
		System.out.println("Capacity String (Before ensurecapacity) : " + capacityStr.capacity());
		capacityStr.ensureCapacity(20);
		System.out.println("Capacity String (After ensurecapacity) : " + capacityStr.capacity());
		
	}

	private static void reverseExample() {
		StringBuffer reverseStr = new StringBuffer();
		reverseStr.append(commonStr);
		reverseStr.reverse();
		reverseStr.ensureCapacity(20);
		System.out.println("Reverse string result: " + reverseStr);
	}

	private static void deleteExample() {
		StringBuffer deleteStr = new StringBuffer();
		deleteStr.append(commonStr);
		deleteStr.delete(10, 15); // Sachin Tenrs
		System.out.println("Delete string result: " + deleteStr);
	}

	private static void replaceExample() {
		StringBuffer replaceStr = new StringBuffer();
		replaceStr.append("Ranjith");
		replaceStr.replace(1, 3, "");
		System.out.println("Replace string result: " + replaceStr);
	}

	private static void insertExample() {
		StringBuffer insertStr = new StringBuffer();
		insertStr.append("Ranjith");
		insertStr.insert(2, "Kumar"); // Insert the string at the 2nd postion
		// insertStr.insert(0, 10d); // Insert the double value(10.0) at the 0th position
		System.out.println("Insert String result: " + insertStr);

	}

	private static void appendExample() {
		StringBuffer appendStr = new StringBuffer("Ranjith");
		appendStr.append("Kumar");
		System.out.println(appendStr);

	}

	/**
	 * StringBuffer, it is used to create mutable String objects i.e. it can be
	 * changed. It is same as string, but it is mutable. StringBuffer, it is
	 * thread safe ie. multiple threads cannot access it simultaneously. So it
	 * is thread safe and result will be an order.
	 */
	private static void basicExample() {
		StringBuffer str = new StringBuffer();
		str = str.append("firstfirstskdlkllllkkkllkkkkkkk");
		System.out.println(str);
		System.out.println(str.capacity());
	}

	private static void roughExampleMethod(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("java").append(" sql");
		System.out.println("string value1: " + sb);
		sb.delete(0, 20);
		// sb = new StringBuffer();
		System.out.println("string value2: " + sb);
		sb.append("spark").append(" scala");
		System.out.println("string value3: " + sb);

		String ss = "Singam";
		System.out.println(ss.charAt(3));
		System.out.println(String.format(ss, args));
	}

}
