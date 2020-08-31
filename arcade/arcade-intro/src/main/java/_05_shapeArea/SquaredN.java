package _05_shapeArea;

class SquaredN extends AbstractSolution {

	/**
	 * <p>
	 * <b>To visualize this solution:</b> In the image below, the black squares are
	 * the "<code>n * n</code>" and the red squares are "<code>(n - 1) * (n - 1)
	 * </code>". To make it easier, try to visualize the polygon as a square and not
	 * as a diamond.
	 * </p>
	 * <p>
	 * <img src="assets/SquaredN_Ex1.png">
	 * </p>
	 * <p>
	 * An alternative way to visualize the solution is shown in the next image.
	 * "<code>n * n</code>" is equal to the diamond's first half (in black,
	 * including the central line) while "<code>(n - 1) * (n - 1)</code>" is equal
	 * to the other half (in red, excluding the central line).
	 * </p>
	 * <p>
	 * <img src="assets/SquaredN_Ex2.png">
	 * </p>
	 */
	int shapeArea(int n) {
		return n * n + --n * n;
	}

}
