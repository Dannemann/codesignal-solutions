package _10_commonCharacterCount;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(
				new Favorite_IncrementingIntArray1(),
				new IncrementingIntArray2(),
				new ReplacingCharsContained1(),
				new ReplacingAndSubtractingLengths(),
				new ReplacingCharsContained2());

		for (AbstractSolution s : solutions) {
			assertEquals(3, s.commonCharacterCount("aabcc", "adcaa"));
			assertEquals(4, s.commonCharacterCount("zzzz", "zzzzzzz"));
			assertEquals(3, s.commonCharacterCount("abca", "xyzbac"));
			assertEquals(0, s.commonCharacterCount("a", "b"));
			assertEquals(1, s.commonCharacterCount("a", "aaa"));
		}
	}

}
