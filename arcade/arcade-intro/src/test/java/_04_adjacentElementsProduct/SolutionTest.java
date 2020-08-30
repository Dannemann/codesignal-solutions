package _04_adjacentElementsProduct;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(
				new Favorite_SumPairsIntStreamRange(),
				new SumPairsManuallyWithMathMax(),
				new SumPairsManually());

		for (AbstractSolution s : solutions) {
			assertEquals(21, s.adjacentElementsProduct(new int[] { 3, 6, -2, -5, 7, 3 }));
			assertEquals(2, s.adjacentElementsProduct(new int[] { -1, -2 }));
			assertEquals(6, s.adjacentElementsProduct(new int[] { 5, 1, 2, 3, 1, 4 }));
			assertEquals(6, s.adjacentElementsProduct(new int[] { 1, 2, 3, 0 }));
			assertEquals(50, s.adjacentElementsProduct(new int[] { 9, 5, 10, 2, 24, -1, -48 }));
			assertEquals(30, s.adjacentElementsProduct(new int[] { 5, 6, -4, 2, 3, 2, -23 }));
			assertEquals(6, s.adjacentElementsProduct(new int[] { 4, 1, 2, 3, 1, 5 }));
			assertEquals(-12, s.adjacentElementsProduct(new int[] { -23, 4, -3, 8, -12 }));
			assertEquals(0, s.adjacentElementsProduct(new int[] { 1, 0, 1, 0, 1000 }));
		}
	}

}
