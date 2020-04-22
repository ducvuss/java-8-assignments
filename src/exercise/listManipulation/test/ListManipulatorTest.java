package exercise.listManipulation.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercise.listManipulation.ListManipulator;

public class ListManipulatorTest {
	

	List<Integer> integers;
	ListManipulator manipulator;
	@BeforeEach
	public void beforeTest( ) {
		integers = new ArrayList<>();
		manipulator = new ListManipulator();
	}

	@Test
	public void testManipulatingList() {
		List<Integer> integers = new ArrayList<>();
		integers.add(5);
		integers.add(5);
		integers.add(5);
		assertEquals("o5,o5,o5", manipulator.toString(integers));
	}
	
	@Test
	public void testManipulatingList2() {
		List<Integer> integers = new ArrayList<>();
		integers.add(5);
		integers.add(6);
		integers.add(100);
		assertEquals("o5,e6,e100", manipulator.toString(integers));
	}
}
