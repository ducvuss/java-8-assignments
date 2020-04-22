package exercise.listManipulation;

import java.util.List;
import java.util.stream.Collectors;

public class ListManipulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String toString(List<Integer> integers) {
		return integers.stream().map(number -> {
			if (number % 2 == 0) {
				return "e" + number;
			}
			return "o" + number;
		}).reduce("", (substring, element) -> {
			if (substring.isEmpty())
				return element;
			return substring + "," + element;
		});
	}
	
	public List<String> filterList(List<String> strings) {
		return strings.stream().filter(string -> {
			return string.startsWith("a") && string.length() == 3;
		}).collect(Collectors.toList());
	}

}
