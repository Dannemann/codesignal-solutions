package _08_matrixElementsSum;

import java.util.HashSet;
import java.util.Set;

class SearchHorizontal extends AbstractSolution {

	int matrixElementsSum(int[][] matrix) {
		int width = matrix[0].length;
		Set<Integer> hauntedColumns = new HashSet<>();
		int total = 0;

		for (int[] h : matrix)
			for (int w = 0; w < width; w++) {
				int hVal = h[w];

				if (hVal == 0)
					hauntedColumns.add(w);
				else if (!hauntedColumns.contains(w))
					total += hVal;
			}

		return total;
	}

}
