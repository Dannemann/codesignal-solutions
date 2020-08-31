package _05_shapeArea;

class CreatingDiamondByBorders extends AbstractSolution {

	/**
	 * <p>
	 * <b>To visualize this solution:</b> Imagine that you are creating the diamond
	 * by the borders. Each iteration is a border and the initial value of
	 * "<code>r = 1</code>" is the central square. The constant "<code>4</code>" is
	 * the number you need to multiply to get the correct number of squares to fill
	 * a border. It is "<code>4</code>" because you need 4 squares to make the very
	 * first border around the central square, making all borders products of 4.
	 * Therefore, the borders will be of sizes 4, 8, 12, 16, 20, 24 and so on. You
	 * can visualize it in the image below. Each color represents a border (purple,
	 * green, yellow and blue) around the central square (red).
	 * </p>
	 * <p>
	 * <img src="assets/CreatingDiamondByBorders_Ex1.png">
	 * </p>
	 */
	int shapeArea(int n) {
		int r = 1;

		for (int i = r; i < n; i++)
			r += 4 * i;

		return r;
	}

}
