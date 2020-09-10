package _07_almostIncreasingSequence;

class Favorite_RunTheArrayAndCompareAfterwards extends AbstractSolution {

	boolean almostIncreasingSequence(int[] sequence) {
		int len = sequence.length;
		int badIndex = -1;
		int qtyBadIndexes = 0;

		for (int i = 1; i < len; i++)
			if (sequence[i] <= sequence[i - 1]) {
				badIndex = i;

				if (qtyBadIndexes++ == 1)
					return false;
			}

		return qtyBadIndexes == 0 || badIndex == 1 || badIndex == len - 1 || sequence[badIndex - 1] < sequence[badIndex + 1] || sequence[badIndex - 2] < sequence[badIndex];
	}

}
