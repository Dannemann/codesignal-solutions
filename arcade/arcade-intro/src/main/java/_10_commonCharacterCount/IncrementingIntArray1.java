package _10_commonCharacterCount;

import java.util.stream.IntStream;

class IncrementingIntArray1 extends AbstractSolution {

	int commonCharacterCount(String s1, String s2) {
		int[] s1chars = new int[26];
		int[] s2chars = new int[26];

		s1.chars().forEach(c -> s1chars[c - 'a']++);
		s2.chars().forEach(c -> s2chars[c - 'a']++);

		return IntStream.range(0, 26).map(i -> Math.min(s1chars[i], s2chars[i])).sum();
	}

}
