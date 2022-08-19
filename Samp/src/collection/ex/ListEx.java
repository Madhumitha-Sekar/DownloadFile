package collection.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		ArrayListMethod();
	}

	private static void ArrayListMethod() {
		List<String> list = new ArrayList<>();
		list.add("Siva");
		list.add("shankar");
		list.add(null);
		list.add(null);
		list.add(null);
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String type = it.next();
			System.out.println("Arraylist value: " + type);
		}
	}

}
