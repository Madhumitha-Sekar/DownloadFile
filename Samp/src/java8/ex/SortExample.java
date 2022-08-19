package java8.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {

	public static void main(String args[]) {
		streamSortedMethod();
	}

	private static void streamSortedMethod() {
		List<String> dataList = Arrays.asList("One", "Two", "Three", "Four", "Five");
		List<String> sortList = dataList.stream().sorted().collect(Collectors.toList());
		sortList.forEach(System.out::println);
	}

}
