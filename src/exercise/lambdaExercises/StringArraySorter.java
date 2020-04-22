package exercise.lambdaExercises;

import java.util.Arrays;

public class StringArraySorter {
	public static void main(String[] args) {
		String[] strings = { "abcd", "b", "bcd", "xy", "zabcde", "n", "omn" };

		StringArraySorter sorter = new StringArraySorter();
		sorter.sortByFirstChar(strings);
	}

	public String[] sortArray(String[] strings) {
		if (strings.length < 2) {
			return strings;
		}

		Arrays.sort(strings, (string1, string2) -> string1.length() - string2.length());
		return strings;
	}

	public String[] reverseSortArray(String[] strings) {
		if (strings.length < 2) {
			return strings;
		}

		Arrays.sort(strings, (string1, string2) -> string2.length() - string1.length());
		return strings;
	}

	public String[] sortByFirstChar(String[] strings) {
		if (strings.length < 2) {
			return strings;
		}

		Arrays.sort(strings, (string1, string2) -> string1.charAt(0) - string2.charAt(0));
//		Arrays.stream(strings).forEach(System.out::println);
		return strings;
	}

	public String[] sortByMiddleChar(String[] strings) {
		if (strings.length < 2) {
			return strings;
		}
		Arrays.sort(strings, (string1, string2) -> {
			int string1ContainsE = string1.contains("e") ? 1 : 0;
			int string2ContainsE = string2.contains("e") ? 1 : 0;
			return string2ContainsE - string1ContainsE;
		});

//		Arrays.stream(strings).forEach(System.out::println);
		return strings;
	}

	public String[] sortByMiddleCharWithStaticHelper(String[] strings) {
		if (strings.length < 2) {
			return strings;
		}
		Arrays.sort(strings, Utils::comparesByMiddleChar);

		return strings;
	}
}

interface Utils {
	static int comparesByMiddleChar(String string1, String string2) {
		int string1ContainsE = string1.contains("e") ? 1 : 0;
		int string2ContainsE = string2.contains("e") ? 1 : 0;
		return string2ContainsE - string1ContainsE;
	}
}
