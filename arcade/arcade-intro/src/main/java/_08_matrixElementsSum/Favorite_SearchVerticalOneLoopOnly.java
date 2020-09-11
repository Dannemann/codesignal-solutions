package _08_matrixElementsSum;

class Favorite_SearchVerticalOneLoopOnly extends AbstractSolution {

	int matrixElementsSum(int[][] matrix) {
		int height = matrix.length;
		int area = matrix[0].length * height; // width * height.
		int total = 0;

		for (int i = 0; i < area; i++) {
			int y = matrix[i % height][i / height];

			if (y == 0)
				i += height - i % height - 1; // "- 1" because of 0 index.
			else
				total += y;
		}

		return total;
	}

}
