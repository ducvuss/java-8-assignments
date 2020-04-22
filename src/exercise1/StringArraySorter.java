package exercise1;

import java.util.Arrays;

public class StringArraySorter {
	public static void main(String[] args) {
	}
	
	public String[] sortArray(String[] strings) {
		if(strings.length < 2) {
			return strings;
		}
		
		Arrays.sort(strings, (string1, string2) -> string1.length() - string2.length());
		return strings;
	}
}



