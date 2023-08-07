package _01_add;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(
				new HelloWorld(),
				new BitShifting());

		for (AbstractSolution s : solutions) {
			assertEquals(3, s.add(1, 2));
			assertEquals(1000, s.add(0, 1000));
			assertEquals(-37, s.add(2, -39));
			assertEquals(199, s.add(99, 100));
			assertEquals(0, s.add(-100, 100));
			assertEquals(-2000, s.add(-1000, -1000));
			// Hidden:
			assertEquals(-1, s.add(-1000, 999));
			assertEquals(200, s.add(100, 100));
			assertEquals(-200, s.add(-100, -100));
			assertEquals(-97, s.add(-98, 1));
			assertEquals(2000, s.add(1000, 1000));
			assertEquals(0, s.add(-1000, 1000));
		}
	}

}
