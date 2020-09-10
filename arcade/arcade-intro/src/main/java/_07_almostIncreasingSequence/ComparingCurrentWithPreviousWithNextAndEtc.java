package _07_almostIncreasingSequence;

class ComparingCurrentWithPreviousWithNextAndEtc extends AbstractSolution {

	boolean almostIncreasingSequence(int[] sequence) {
		int len = sequence.length;

		if (len > 2)
			for (int badNumberFound = 0, i = 1; i < len; i++) {
				int prePrevious = i == 1 ? Integer.MIN_VALUE : sequence[i - 2];
				int previous = sequence[i - 1];
				int current = sequence[i];
				int next = i == len - 1 ? Integer.MAX_VALUE : sequence[i + 1];

				if (current <= previous && badNumberFound++ == 1 || current <= prePrevious && previous >= next)
					return false;
			}

		return true;
	}

}
