package _09_allLongestStrings;

class Favorite_StringAndIndexOf extends AbstractSolution {

	String[] allLongestStrings(String[] inputArray) {
		StringBuilder longStrs = new StringBuilder();

		for (String s : inputArray) {
			int strLen = s.length();
			int longestLen = longStrs.indexOf("-");

			if (strLen > longestLen)
				longStrs = new StringBuilder(s).append("-");
			else if (strLen == longestLen)
				longStrs.append(s).append("-");
		}

		return longStrs.toString().split("-");
	}

}
