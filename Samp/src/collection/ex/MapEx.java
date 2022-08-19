package collection.ex;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		hashMapMethod();
	}

	private static void hashMapMethod() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Siva");
		map.put(2, "Siva");
		map.put(null, null);
		map.put(null, null);
		
		for(Map.Entry<Integer, String> mp : map.entrySet()) {
			System.out.println("HashMap values: key: " + mp.getKey() + " values: " + mp.getValue());
		}
		
	}

}
