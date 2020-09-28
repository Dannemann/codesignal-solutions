package _10_commonCharacterCount;

class Favorite_IncrementingIntArray1 extends AbstractSolution {

	int commonCharacterCount(String s1, String s2) {
		int[] chars = new int[128];

		s1.chars().forEach(c -> chars[c]++);

		int common = 0;

		for (char c : s2.toCharArray())
			if (chars[c]-- > 0)
				common++;

		return common;
	}

}
