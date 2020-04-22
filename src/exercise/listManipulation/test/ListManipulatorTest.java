package exercise.listManipulation.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercise.lambdaExercises.StringArraySorter;
import exercise.listManipulation.ListManipulator;

public class ListManipulatorTest {
	

	List<Integer> integers;
	List<String> strings;
	ListManipulator manipulator;
	@BeforeEach
	public void beforeTest( ) {
		integers = new ArrayList<>();
		strings = new ArrayList<>();
		manipulator = new ListManipulator();
	}

	@Test
	public void testManipulatingList() {
		integers.add(5);
		integers.add(5);
		integers.add(5);
		assertEquals("o5,o5,o5", manipulator.toString(integers));
	}
	
	@Test
	public void testManipulatingList2() {
		integers.add(5);
		integers.add(6);
		integers.add(100);
		assertEquals("o5,e6,e100", manipulator.toString(integers));
	}
	
	@Test
	public void testManipulatingList3() {
		strings.add("ant");
		strings.add("aunt");
		strings.add("and");
		strings.add("ate");
		strings.add("banana");
		strings.add("tomato");
		strings.add("abc");
		String[] expected = { "ant", "and", "ate", "abc", };
		
		

		List<String> actual = manipulator.filterList(strings);
		for (int i = 0; i < actual.size(); i++) {
			assertEquals(expected[i], actual.get(i));
		}
	}
	

}
