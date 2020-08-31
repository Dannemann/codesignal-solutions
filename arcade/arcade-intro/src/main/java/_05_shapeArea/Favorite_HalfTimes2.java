package _05_shapeArea;

class Favorite_HalfTimes2 extends AbstractSolution {

	/**
	 * <p>
	 * <b>To visualize this solution:</b> For this solution we simply find the half
	 * with "<code>n * (n - 1)</code>" and multiply it by 2. The "<code>+ 1</code>"
	 * at the end is the central square (green). Check the image below:
	 * </p>
	 * <p>
	 * <img src="assets/HalfTimes2_Ex.png">
	 * </p>
	 */
	int shapeArea(int n) {
		return n * (n - 1) * 2 + 1;
	}

}
