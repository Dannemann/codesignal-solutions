package _09_allLongestStrings;

import java.util.Arrays;

class TwoLoopsWithStreams extends AbstractSolution {

	String[] allLongestStrings(String[] inputArray) {
		return Arrays.stream(inputArray).filter(s -> s.length() == Arrays.stream(inputArray).mapToInt(String::length).max().getAsInt()).toArray(String[]::new);
	}

}
