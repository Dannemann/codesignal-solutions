package _06_makeArrayConsecutive2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(
				new TrickySubtraction(),
				new TrickySubtractionOnEachElement(),
				new CrushingWalls());

		for (AbstractSolution s : solutions) {
			assertEquals(3, s.makeArrayConsecutive2(new int[] { 6, 2, 3, 8 }));
			assertEquals(2, s.makeArrayConsecutive2(new int[] { 0, 3 }));
			assertEquals(0, s.makeArrayConsecutive2(new int[] { 5, 4, 6 }));
			assertEquals(2, s.makeArrayConsecutive2(new int[] { 6, 3 }));
			assertEquals(0, s.makeArrayConsecutive2(new int[] { 1 }));
			// Custom:
			assertEquals(19, s.makeArrayConsecutive2(new int[] { 0, 20 }));
			assertEquals(4, s.makeArrayConsecutive2(new int[] { 15, 20 }));
		}
	}

}
