package _09_allLongestStrings;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = Arrays.asList(
				new Favorite_CopyingLongestToOtherArray(),
				new Favorite_StringAndIndexOf(),
				new TwoLoopsWithStreams());

		for (AbstractSolution s : solutions) {
			assertArrayEquals(new String[] { "aba", "vcd", "aba" }, s.allLongestStrings(new String[] { "aba", "aa", "ad", "vcd", "aba" }));
			assertArrayEquals(new String[] { "aa" }, s.allLongestStrings(new String[] { "aa" }));
			assertArrayEquals(new String[] { "eeee", "abcd" }, s.allLongestStrings(new String[] { "abc", "eeee", "abcd", "dcd" }));
			assertArrayEquals(new String[] { "zzzzzz", "abcdef", "aaaaaa" }, s.allLongestStrings(new String[] { "a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa" }));
			assertArrayEquals(new String[] { "varennyky" }, s.allLongestStrings(new String[] { "enyky", "benyky", "yely", "varennyky" }));
			assertArrayEquals(new String[] { "abacaba" }, s.allLongestStrings(new String[] { "abacaba", "abacab", "abac", "xxxxxx" }));
			assertArrayEquals(new String[] { "yooooooung", "watermelon" }, s.allLongestStrings(new String[] { "young", "yooooooung", "hot", "or", "not", "come", "on", "fire", "water", "watermelon" }));
			assertArrayEquals(new String[] { "aokbcwthc" }, s.allLongestStrings(new String[] { "onsfnib", "aokbcwthc", "jrfcw" }));
			assertArrayEquals(new String[] { "lbgwyqkry" }, s.allLongestStrings(new String[] { "lbgwyqkry" }));
			assertArrayEquals(new String[] { "i" }, s.allLongestStrings(new String[] { "i" }));
		}
	}

}
