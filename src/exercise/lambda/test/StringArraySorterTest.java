package exercise.lambda.test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import exercise.lambda.StringArraySorter;

public class StringArraySorterTest {
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
	
	@Test
	public void reverseByFirstCharTest() {
		String[] strings = {"abcd", "b", "bcd", "xy", "zabcde", "n", "omn"};
		String[] sorted = {"abcd", "b", "bcd", "n", "omn", "xy", "zabcde"};
		
		StringArraySorter sorter = new StringArraySorter();
		String[] sortedArr = sorter.sortByFirstChar(strings);
		for(int i = 0; i < strings.length; i++) {
			assertEquals(sorted[i], sortedArr[i]);
		}
	}
	
	
	
}
