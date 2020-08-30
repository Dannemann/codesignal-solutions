package _04_adjacentElementsProduct;

class SumPairsManually extends AbstractSolution {

	int adjacentElementsProduct(int[] inputArray) {
		int len = inputArray.length;
		int biggest = inputArray[0] * inputArray[1];
		int product;

		for (int i = 2; i < len; i++)
			if ((product = inputArray[i] * inputArray[i - 1]) > biggest)
				biggest = product;

		return biggest;
	}

}
