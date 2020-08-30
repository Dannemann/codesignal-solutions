package _04_adjacentElementsProduct;

class SumPairsManuallyWithMathMax extends AbstractSolution {

	int adjacentElementsProduct(int[] inputArray) {
		int len = inputArray.length;
		int biggest = inputArray[0] * inputArray[1];

		for (int i = 2; i < len; i++)
			biggest = Math.max(biggest, inputArray[i] * inputArray[i - 1]);

		return biggest;
	}

}
