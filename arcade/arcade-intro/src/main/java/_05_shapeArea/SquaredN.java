package _05_shapeArea;

class SquaredN extends AbstractSolution {

    /**
     * <p>
     * <b>To visualize this solution:</b> In the image below, the black squares are
     * "<code>n * n</code>" and the red ones "<code>(n - 1) * (n - 1)
     * </code>". To make it easier, try to visualize the polygon as a square and not
     * as a diamond.
     * </p>
     * <p>
     * <img src="assets/SquaredN_Ex1.png">
     * </p>
     * <p>
     * An alternative way to visualize the solution is shown in the next image.
     * "<code>n * n</code>" is equal to the diamond's lower half (in black) while
     * "<code>(n - 1) * (n - 1)</code>" is equal to the upper half (in red).
     * </p>
     * <p>
     * <img src="assets/SquaredN_Ex2.png">
     * </p>
     */
    int shapeArea(int n) {
        return n * n + --n * n;
    }

}
