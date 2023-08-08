package _05_shapeArea;

class SliceInPieces extends AbstractSolution {

	/**
	 * <p>
	 * <b>To visualize this solution:</b> In this solution, we slice the polygon
	 * into pieces (blue, red, green, yellow, and pink), as shown in the image
	 * below. Notice how each piece is made of "<code>(n * 2 - 1)</code>" squares,
	 * and we need "<code>(n - 1)</code>" pieces to fill most of the polygon. To
	 * finish it, we need one more piece of size "<code>n</code>" (the pink one). To
	 * make it easier, try to visualize the polygon as a square and not as a
	 * diamond.
	 * </p>
	 * <p>
	 * <img src="assets/SliceInPieces_Ex.png">
	 * </p>
	 */
	int shapeArea(int n) {
		return (n * 2 - 1) * (n - 1) + n;
	}

}
