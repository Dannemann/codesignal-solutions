package _05_shapeArea;

class MultiplyingOddsBy2 extends AbstractSolution {

	// TODO: Explain this one.
	/**
	 * <p>
	 * <b>To visualize this solution:</b>
	 * </p>
	 * <p>
	 * <img src="assets/MultiplyingOddsBy2_Ex.png">
	 * </p>
	 */
	int shapeArea(int n) {
		int climax = n * 2 - 1;
		int m = n - 1;
		int result = climax;
		int incr = 1;

		for (int i = 0; i < m; i++) {
			result += incr * 2;
			incr += 2;
		}

		return result;
	}

}
