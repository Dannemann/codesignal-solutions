package _06_makeArrayConsecutive2;

class CrushingWalls extends AbstractSolution {

	int makeArrayConsecutive2(int[] statues) {
		int helper[] = new int[21];

		for (int i : statues)
			helper[i] = 1;

		int leftValue = helper[0];
		int backwardsCount = 20;
		boolean startCounting = false;
		int result = 0;

		for (int i = 1; i < 21; i++)
			if (leftValue == 0)
				leftValue = helper[i];
			else if (helper[backwardsCount--] == 0) {
				if (startCounting)
					result++;
			} else
				startCounting = true;

		return result;
	}

}
