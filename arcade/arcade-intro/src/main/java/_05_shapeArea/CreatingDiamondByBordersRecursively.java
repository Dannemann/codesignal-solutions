package _05_shapeArea;

class CreatingDiamondByBordersRecursively extends AbstractSolution {

	/**
	 * <b>To visualize this solution:</b> This is the same as the other
	 * "CreatingDiamondByBorders" solutions but done recursively just for fun. The
	 * "<code>1</code>" returned by "<code>n == 0 ? 1</code>" is the central square.
	 */
	int shapeArea(int n) {
		return n == 0 ? 1 : 4 * --n + shapeArea(n);
	}

}
