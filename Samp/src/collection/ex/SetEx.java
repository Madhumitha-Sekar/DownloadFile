package collection.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
//		hashSetMethod();
		linkedHashSetMethod();
	}

	private static void linkedHashSetMethod() {
		Set<String> hs = new LinkedHashSet<>();
		hs.add("Siva");
		hs.add("shankar");
		hs.add(null);
		
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println("linkedlist Itr value " + string);
			
		}
	}

	private static void hashSetMethod() {
		Set<String> hs = new HashSet<>();
		hs.add("Siva");
		hs.add("shankar");
		hs.add(null);
		
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println("Itr value " + string);
			
		}
	}

}
