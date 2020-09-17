package _08_matrixElementsSum;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(
				new Favorite_SearchVertical(),
				new Favorite_SearchVerticalOneLoopOnly(),
				new SearchHorizontal(),
				new SearchVerticallyByLineIntStream());

		for (AbstractSolution s : solutions) {
			assertEquals(9, s.matrixElementsSum(new int[][] { { 0, 1, 1, 2 }, { 0, 5, 0, 0 }, { 2, 0, 3, 3 } }));
			assertEquals(9, s.matrixElementsSum(new int[][] { { 1, 1, 1, 0 }, { 0, 5, 0, 1 }, { 2, 1, 3, 10 } }));
			assertEquals(18, s.matrixElementsSum(new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } }));
			assertEquals(0, s.matrixElementsSum(new int[][] { { 0 } }));
			assertEquals(5, s.matrixElementsSum(new int[][] { { 1, 0, 3 }, { 0, 2, 1 }, { 1, 2, 0 } }));
			assertEquals(6, s.matrixElementsSum(new int[][] { { 1 }, { 5 }, { 0 }, { 2 } }));
			assertEquals(15, s.matrixElementsSum(new int[][] { { 1, 2, 3, 4, 5 } }));
			assertEquals(17, s.matrixElementsSum(new int[][] { { 2 }, { 5 }, { 10 } }));
			assertEquals(15, s.matrixElementsSum(new int[][] { { 4, 0, 1 }, { 10, 7, 0 }, { 0, 0, 0 }, { 9, 1, 2 } }));
			assertEquals(1, s.matrixElementsSum(new int[][] { { 1 } }));
		}
	}

}
