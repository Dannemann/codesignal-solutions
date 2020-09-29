package _09_allLongestStrings;

import java.util.Arrays;

class TwoLoopsWithStreams extends AbstractSolution {

	String[] allLongestStrings(String[] inputArray) {
		int longestLen = Arrays.stream(inputArray).mapToInt(String::length).max().getAsInt();

		return Arrays.stream(inputArray).filter(s -> s.length() == longestLen).toArray(String[]::new);
	}

}
