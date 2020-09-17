package _09_allLongestStrings;

import java.util.ArrayList;
import java.util.List;

class Favorite_CopyingLongestToOtherArray extends AbstractSolution {

	String[] allLongestStrings(String[] inputArray) {
		int longestLen = -1;
		List<String> longestStrs = null;

		for (String str : inputArray) {
			int strLen = str.length();

			if (strLen > longestLen) {
				longestLen = strLen;

				longestStrs = new ArrayList<>(); // Google something like "new ArrayList vs clear". Given the question constraints, we know that no resize will be necessary here.
				longestStrs.add(str);
			} else if (strLen == longestLen)
				longestStrs.add(str);
		}

		return longestStrs.toArray(new String[0]);
	}

}
