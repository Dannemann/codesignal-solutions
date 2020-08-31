package _05_shapeArea;

class SliceInPieces extends AbstractSolution {

	/**
	 * <p>
	 * <b>To visualize this solution:</b> In this solution we slice the polygon in
	 * pieces (blue, red, green, yellow and pink) as shown in the image below.
	 * Notice how each piece is made of "<code>n * 2 - 1</code>" squares and we need
	 * "<code>n - 1</code>" pieces to fill most of the polygon. To finish it, we
	 * need one more piece of size "<code>n</code>" (the pink piece, which is the
	 * initial value of "<code>n</code>").
	 * </p>
	 * <p>
	 * <img src="assets/SliceInPieces_Ex.png">
	 * </p>
	 */
	int shapeArea(int n) {
		int nMinus1 = n - 1;
		int piece = n * 2 - 1;

		for (int i = 0; i < nMinus1; i++)
			n += piece;

		return n;
	}

	/**
	 * IntStream version.
	 */
//	int shapeArea(int n) {
//		int piece = n * 2 - 1;
//		return IntStream.range(0, n - 1).map(i -> piece).sum() + n;
//	}

}
