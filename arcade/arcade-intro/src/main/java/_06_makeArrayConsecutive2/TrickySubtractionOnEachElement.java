package _06_makeArrayConsecutive2;

import java.util.Arrays;

class TrickySubtractionOnEachElement extends AbstractSolution {

	int makeArrayConsecutive2(int[] statues) {
		Arrays.sort(statues);

		int len = statues.length;
		int result = 0;

		for (int i = 1; i < len; i++)
			result += statues[i] - statues[i - 1] - 1;

		return result;
	}

	/**
	 * IntStream version.
	 */
//	int makeArrayConsecutive2(int[] statues) {
//		Arrays.sort(statues);
//
//		return IntStream.range(1, statues.length).map(i -> statues[i] - statues[i - 1] - 1).sum();
//	}

}
