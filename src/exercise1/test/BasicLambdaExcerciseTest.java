package exercise1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
	
	@Test
	public void reverseSortArrayTest() {
		String[] strings = {"abcd", "a", "abc", "ab", "abcde", "a", "ab"};
		String[] sorted = {"abcde", "abcd", "abc", "ab", "ab", "a", "a"};
		
		StringArraySorter sorter = new StringArraySorter();
		String[] sortedArr = sorter.reverseSortArray(strings);
		for(int i = 0; i < strings.length; i++) {
			assertEquals(sorted[i], sortedArr[i]);
		}
	}
	
	
}
