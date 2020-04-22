package exercise1;

import java.util.Arrays;

public class StringArraySorter {
	public static void main(String[] args) {
		String[] strings = {"abcd", "b", "bcd", "xy", "zabcde", "n", "omn"};
		
		StringArraySorter sorter = new StringArraySorter();
		sorter.sortByFirstChar(strings);
	}
	
	public String[] sortArray(String[] strings) {
		if(strings.length < 2) {
			return strings;
		}
		
		Arrays.sort(strings, (string1, string2) -> string1.length() - string2.length());
		return strings;
	}

	public String[] reverseSortArray(String[] strings) {
		if(strings.length < 2) {
			return strings;
		}
		
		Arrays.sort(strings, (string1, string2) -> string2.length() - string1.length());
		return strings;
	}
	
	public String[] sortByFirstChar(String[] strings) {
		if(strings.length < 2) {
			return strings;
		}
		
		Arrays.sort(strings, (string1, string2) -> string1.charAt(0) - string2.charAt(0));
//		Arrays.stream(strings).forEach(System.out::println);
		return strings;
	}
	
}



