package _12_sortByHeight;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(
				new InsertionSorting(),
				new BubbleSorting());

		for (AbstractSolution s : solutions) {
			assertArrayEquals(new int[] { -1, 150, 160, 170, -1, -1, 180, 190 }, s.sortByHeight(new int[] { -1, 150, 190, 170, -1, -1, 160, 180 }));
			assertArrayEquals(new int[] { -1, -1, -1, -1, -1 }, s.sortByHeight(new int[] { -1, -1, -1, -1, -1 }));
			assertArrayEquals(new int[] { -1 }, s.sortByHeight(new int[] { -1 }));
			assertArrayEquals(new int[] { 2, 2, 4, 9, 11, 16 }, s.sortByHeight(new int[] { 4, 2, 9, 11, 2, 16 }));
			assertArrayEquals(new int[] { 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2 }, s.sortByHeight(new int[] { 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1 }));
			assertArrayEquals(new int[] { 1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77 }, s.sortByHeight(new int[] { 23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3 }));
			// Custom:
			assertArrayEquals(new int[] { -1, -1, 2, -1, 2, -1, 4, 9, -1, 11, 16 }, s.sortByHeight(new int[] { -1, -1, 4, -1, 2, -1, 9, 11, -1, 2, 16 }));
			assertArrayEquals(new int[] { -1, 6, -1, 6, 6, -1, 6, -1, 40, -1, 56 }, s.sortByHeight(new int[] { -1, 6, -1, 6, 56, -1, 40, -1, 6, -1, 6 }));
		}
	}

}
