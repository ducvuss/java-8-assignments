package exercise.lambdaExercises.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import exercise.lambdaExercises.StringArraySorter;

public class StringArraySorterTest {
	@Test
	public void sortArrayTest() {
		String[] strings = { "abcd", "a", "abc", "ab", "abcde", "a", "ab" };
		String[] sorted = { "a", "a", "ab", "ab", "abc", "abcd", "abcde", };

		StringArraySorter sorter = new StringArraySorter();
		String[] sortedArr = sorter.sortArray(strings);
		
		IntStream.range(0, strings.length).forEach(i -> {
			assertEquals(sorted[i], sortedArr[i]);
		});
	}

	@Test
	public void reverseSortArrayTest() {
		String[] strings = { "abcd", "a", "abc", "ab", "abcde", "a", "ab" };
		String[] sorted = { "abcde", "abcd", "abc", "ab", "ab", "a", "a" };

		StringArraySorter sorter = new StringArraySorter();
		String[] sortedArr = sorter.reverseSortArray(strings);
		for (int i = 0; i < strings.length; i++) {
			assertEquals(sorted[i], sortedArr[i]);
		}
	}

	@Test
	public void sortByFirstCharTest() {
		String[] strings = { "abcd", "b", "bcd", "xy", "zabcde", "n", "omn" };
		String[] sorted = { "abcd", "b", "bcd", "n", "omn", "xy", "zabcde" };

		StringArraySorter sorter = new StringArraySorter();
		String[] sortedArr = sorter.sortByFirstChar(strings);
		for (int i = 0; i < strings.length; i++) {
			assertEquals(sorted[i], sortedArr[i]);
		}
	}

	@Test
	public void sortByMiddleCharTest() {
		String[] strings = { "abcd", "be", "bcd", "xye", "zabcde", "n", "omn" };
		String[] sorted = { "be", "xye", "zabcde", "abcd", "bcd", "n", "omn" };

		StringArraySorter sorter = new StringArraySorter();
		String[] sortedArr = sorter.sortByMiddleChar(strings);
		for (int i = 0; i < strings.length; i++) {
			assertEquals(sorted[i], sortedArr[i]);
		}
	}

	@Test
	public void sortByMiddleCharWithStaticHelperTest() {
		String[] strings = { "abcd", "be", "bcd", "xye", "zabcde", "n", "omn" };
		String[] sorted = { "be", "xye", "zabcde", "abcd", "bcd", "n", "omn" };

		StringArraySorter sorter = new StringArraySorter();
		String[] sortedArr = sorter.sortByMiddleCharWithStaticHelper(strings);
		for (int i = 0; i < strings.length; i++) {
			assertEquals(sorted[i], sortedArr[i]);
		}
	}
}
