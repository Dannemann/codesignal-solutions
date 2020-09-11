package _08_matrixElementsSum;

class Favorite_SearchVertical extends AbstractSolution {

	int matrixElementsSum(int[][] matrix) {
		int width = matrix[0].length;
		int total = 0;

		for (int w = 0; w < width; w++)
			for (int[] h : matrix) {
				int y = h[w];

				if (y == 0)
					break;
				else
					total += y;
			}

		return total;
	}

	/**
	 * Compact version.
	 */
//	int matrixElementsSum(int[][] matrix) {
//		int total = 0;
//
//		for (int w = 0, width = matrix[0].length; w < width; w++)
//			for (int h = 0, height = matrix.length, y; h < height && (y = matrix[h][w]) > 0; total += y, h++)
//				;
//
//		return total;
//	}

}
