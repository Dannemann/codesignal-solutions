package _10_commonCharacterCount;

class ReplacingAndSubtractingLengths extends AbstractSolution {

	int commonCharacterCount(String s1, String s2) {
		int s2InitialLen = s2.length();

		for (String c1 : s1.split(""))
			s2 = s2.replaceFirst(c1, "");

		return s2InitialLen - s2.length();
	}

}
