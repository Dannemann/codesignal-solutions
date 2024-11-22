package _04_adjacentElementsProduct;

import java.util.stream.IntStream;

class SumPairsIntStreamRange extends AbstractSolution {

	int adjacentElementsProduct(int[] inputArray) {
		return IntStream.range(0, inputArray.length - 1).map(i -> inputArray[i] * inputArray[i + 1]).max().getAsInt();
	}

}
