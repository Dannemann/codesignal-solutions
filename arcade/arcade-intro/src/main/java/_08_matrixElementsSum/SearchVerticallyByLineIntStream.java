package _08_matrixElementsSum;

import java.util.stream.IntStream;

class SearchVerticallyByLineIntStream extends AbstractSolution {

	int matrixElementsSum(int[][] matrix) {
		return IntStream.range(0, matrix.length).map(h -> IntStream.range(0, matrix[0].length).map(w -> IntStream.range(0, h).allMatch(i -> matrix[i][w] > 0) ? matrix[h][w] : 0).sum()).sum();
	}

}
