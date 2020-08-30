package _02_centuryFromYear;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(
				new Favorite_Plus99Divide(),
				new Subtract1DivideAdd1(),
				new MathCeil(),
				new Plus1IfNotCenturyYear());

		for (AbstractSolution s : solutions) {
			assertEquals(20, s.centuryFromYear(1905));
			assertEquals(17, s.centuryFromYear(1700));
			assertEquals(20, s.centuryFromYear(1988));
			assertEquals(20, s.centuryFromYear(2000));
			assertEquals(21, s.centuryFromYear(2001));
			assertEquals(2, s.centuryFromYear(200));
			assertEquals(4, s.centuryFromYear(374));
			assertEquals(1, s.centuryFromYear(45));
			assertEquals(1, s.centuryFromYear(8));
			// Hidden.
			assertEquals(3, s.centuryFromYear(300));
			assertEquals(16, s.centuryFromYear(1588));
			assertEquals(1, s.centuryFromYear(1));
			assertEquals(1, s.centuryFromYear(50));
			assertEquals(2, s.centuryFromYear(101));
			assertEquals(1, s.centuryFromYear(34));
			assertEquals(9, s.centuryFromYear(827));
			assertEquals(21, s.centuryFromYear(2005));
			assertEquals(12, s.centuryFromYear(1200));
		}
	}

}
