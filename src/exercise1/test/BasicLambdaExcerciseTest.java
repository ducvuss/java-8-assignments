package exercise1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import exercise1.StringArraySorter;

public class BasicLambdaExcerciseTest {
	@Test
	public void sortArrayTest() {
		String[] strings = {"abcd", "a", "abc", "ab", "abcde", "a", "ab"};
		String[] sorted = {"a", "a", "ab", "ab", "abc", "abcd", "abcde",};
		
		StringArraySorter sorter = new StringArraySorter();
		String[] sortedArr = sorter.sortArray(strings);
		for(int i = 0; i < strings.length; i++) {
			assertEquals(sorted[i], sortedArr[i]);
		}
	}
}
