package _10_commonCharacterCount;

class Favorite_ReplacingCharsContained1 extends AbstractSolution {

	int commonCharacterCount(String s1, String s2) {
		for (String s : s1.split(""))
			s2 = s2.replaceFirst(s, "!");

		return s2.replaceAll("[^!]", "").length();
	}

}
