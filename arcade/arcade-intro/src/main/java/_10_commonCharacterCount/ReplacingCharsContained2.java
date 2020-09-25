package _10_commonCharacterCount;

class ReplacingCharsContained2 extends AbstractSolution {

	int commonCharacterCount(String s1, String s2) {
		int commonsQty = 0;

		for (String c1 : s1.split(""))
			if (s2.contains(c1)) {
				s2 = s2.replaceFirst(c1, "");
				commonsQty++;
			}

		return commonsQty;
	}

}
