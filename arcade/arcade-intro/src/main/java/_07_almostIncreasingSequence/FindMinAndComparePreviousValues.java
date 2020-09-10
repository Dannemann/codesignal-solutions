package _07_almostIncreasingSequence;

class FindMinAndComparePreviousValues extends AbstractSolution {

	boolean almostIncreasingSequence(int[] sequence) {
		int prePrevious = Integer.MIN_VALUE;
		int previous = prePrevious;
		int badIndexFound = 0;

		for (int current : sequence)
			if (current <= previous) {
				if (badIndexFound++ == 1)
					return false;

				if (current > prePrevious)
					previous = current;
			} else {
				prePrevious = previous;
				previous = current;
			}

		return true;
	}

}
