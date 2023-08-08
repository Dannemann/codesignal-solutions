package _05_shapeArea;

class MultiplyingOddsBy2 extends AbstractSolution {

	/**
	 * <p>
	 * <b>To visualize this solution:</b> <code>lastBlock</code> represents the
	 * yellow (last) block in the polygon. The other blocks we find by multiplying
	 * 1, 3, 5, etc by 2. It's just a random pattern I found when thinking on this
	 * problem's solution.
	 * </p>
	 * <p>
	 * <img src="assets/MultiplyingOddsBy2_Ex.png">
	 * </p>
	 */
	int shapeArea(int n) {
		int lastBlock = n * 2 - 1;
		int j = n - 1;
		int sum = lastBlock;
		int incr = 1;

		for (int i = 0; i < j; i++) {
			sum += incr * 2;
			incr += 2;
		}

		return sum;
	}

}
