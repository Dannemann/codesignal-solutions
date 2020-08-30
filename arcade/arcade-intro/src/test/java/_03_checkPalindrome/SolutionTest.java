package _03_checkPalindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(
				new ReverseAndCompare(),
				new ManualReverseAndCompare(),
				new ComparingFirstAndLastChars(),
				new ComparingFirstAndLastCharsRecursive(),
				new BadHalfsComparation());

		for (AbstractSolution s : solutions) {
			assertTrue(s.checkPalindrome("aabaa"));
			assertFalse(s.checkPalindrome("abac"));
			assertTrue(s.checkPalindrome("a"));
			assertFalse(s.checkPalindrome("az"));
			assertTrue(s.checkPalindrome("abacaba"));
			assertTrue(s.checkPalindrome("z"));
			assertFalse(s.checkPalindrome("aaabaaaa"));
			assertFalse(s.checkPalindrome("zzzazzazz"));
			assertTrue(s.checkPalindrome("hlbeeykoqqqqokyeeblh"));
			assertTrue(s.checkPalindrome("hlbeeykoqqqokyeeblh"));
		}
	}

}
