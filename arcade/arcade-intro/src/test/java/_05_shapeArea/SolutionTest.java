package _05_shapeArea;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(
				new Favorite_HalfTimes2(),
				new SquaredN(),
				new CreatingDiamondByBordersWithIntStream(),
				new CreatingDiamondByBorders());

		for (AbstractSolution s : solutions) {
			assertEquals(5, s.shapeArea(2));
			assertEquals(13, s.shapeArea(3));
			assertEquals(1, s.shapeArea(1));
			assertEquals(41, s.shapeArea(5));
			assertEquals(97986001, s.shapeArea(7000));
			assertEquals(127984001, s.shapeArea(8000));
			assertEquals(199940005, s.shapeArea(9999));
			assertEquals(199900013, s.shapeArea(9998));
			assertEquals(161946005, s.shapeArea(8999));
			assertEquals(19801, s.shapeArea(100));
		}
	}

}
