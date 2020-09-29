package _11_isLucky;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(
				new Favorite_LoopAnInteger(),
				new SubtractingHalfs(),
				new ComparingHalfs());

		for (AbstractSolution s : solutions) {
			assertTrue(s.isLucky(1230));
			assertFalse(s.isLucky(239017));
			assertTrue(s.isLucky(134008));
			assertFalse(s.isLucky(10));
			assertTrue(s.isLucky(11));
			assertTrue(s.isLucky(1010));
			assertFalse(s.isLucky(261534));
			assertFalse(s.isLucky(100000));
			assertTrue(s.isLucky(999999));
			assertTrue(s.isLucky(123321));
		}
	}

}
