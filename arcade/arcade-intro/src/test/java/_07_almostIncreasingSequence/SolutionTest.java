package _07_almostIncreasingSequence;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(new Solution());

		for (AbstractSolution s : solutions) {
			assertFalse(s.almostIncreasingSequence(new int[] { 1, 3, 2, 1 }));
			assertTrue(s.almostIncreasingSequence(new int[] { 1, 3, 2 }));
			assertFalse(s.almostIncreasingSequence(new int[] { 1, 2, 1, 2 }));
			assertFalse(s.almostIncreasingSequence(new int[] { 3, 6, 5, 8, 10, 20, 15 }));
			assertFalse(s.almostIncreasingSequence(new int[] { 1, 1, 2, 3, 4, 4 }));
			assertFalse(s.almostIncreasingSequence(new int[] { 1, 4, 10, 4, 2 }));
			assertTrue(s.almostIncreasingSequence(new int[] { 10, 1, 2, 3, 4, 5 }));
			assertFalse(s.almostIncreasingSequence(new int[] { 1, 1, 1, 2, 3 }));
			assertTrue(s.almostIncreasingSequence(new int[] { 0, -2, 5, 6 }));
			assertFalse(s.almostIncreasingSequence(new int[] { 1, 2, 3, 4, 5, 3, 5, 6 }));
			assertFalse(s.almostIncreasingSequence(new int[] { 40, 50, 60, 10, 20, 30 }));
			assertTrue(s.almostIncreasingSequence(new int[] { 1, 1 }));
			assertTrue(s.almostIncreasingSequence(new int[] { 1, 2, 5, 3, 5 }));
			assertFalse(s.almostIncreasingSequence(new int[] { 1, 2, 5, 5, 5 }));
			assertFalse(s.almostIncreasingSequence(new int[] { 10, 1, 2, 3, 4, 5, 6, 1 }));
			assertTrue(s.almostIncreasingSequence(new int[] { 1, 2, 3, 4, 3, 6 }));
			assertTrue(s.almostIncreasingSequence(new int[] { 1, 2, 3, 4, 99, 5, 6 }));
			assertTrue(s.almostIncreasingSequence(new int[] { 123, -17, -5, 1, 2, 3, 12, 43, 45 }));
			assertTrue(s.almostIncreasingSequence(new int[] { 3, 5, 67, 98, 3 }));
		}
	}

}
