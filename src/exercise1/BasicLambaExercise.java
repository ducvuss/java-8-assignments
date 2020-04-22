package exercise1;

import java.util.Arrays;

public class BasicLambaExercise {
	public static void main(String[] args) {
		
	}
	
	public void sortArray(String[] strings) {
		if(strings.length < 2) {
			return;
		}
		
		Arrays.sort(strings, (string1, string2) -> string1.length() - string2.length());
	}
}



