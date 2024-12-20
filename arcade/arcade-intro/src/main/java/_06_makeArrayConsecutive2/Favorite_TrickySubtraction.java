package _06_makeArrayConsecutive2;

import java.util.Arrays;

class Favorite_TrickySubtraction extends AbstractSolution {

	/**
	 * <p>
	 * <b>To visualize this solution:</b> This one is a little tricky because of a
	 * very simple detail at "<code>+ 1</code>". This "plus one" addition is the
	 * catch.
	 * </p>
	 * <p>
	 * For instance, let's take the array <code>[7, 10, 5]</code> which can be
	 * sorted and rearranged to <code>[5, ?, 7, ?, ?, 10]</code>.
	 * </p>
	 * <p>
	 * The first and most important thing to realize here is that <b>the rearranged
	 * array has 6 elements, not 5</b>. That's the trick! Look and count the
	 * elements: <code>[5, 6, 7, 8, 9, 10]</code>. Again, the length of this array
	 * is 6 and not 5 because <b>between 5 and 10 we have 6 numbers (if we include
	 * <code>[5]</code>, as our array do)</b>. When we subtract "10 - 5", we are
	 * <b>removing the <code>[5]</code> from the array because a mathematical
	 * subtraction is inclusive and considers all numbers up to 10</b>.
	 * </p>
	 * <p>
	 * So, 10 numbers: "1, 2, 3, 4, 5, 6, 7, 8, 9, 10". By subtracting 5, we remove
	 * 5 elements "1, 2, 3, 4, 5" and the result is the remaining 5 elements "6, 7,
	 * 8, 9, 10". Where is the "5" in the remaining elements?
	 * </p>
	 * <p>
	 * That's why we need to add "<code>+ 1</code>" to
	 * "<code>statues[statues.length - 1] - statues[0]</code>". The subtraction will
	 * remove the <code>[5]</code> from the original array
	 * <code>[5, ?, 7, ?, ?, 10]</code> if we do "10 - 5".
	 * </p>
	 * <p>
	 * <b>Let's take another example:</b> the array <code>[6, 2, 3, 8]</code> which
	 * can be sorted and rearranged to <code>[2, 3, ?, ?, 6, ?, 8]</code>.
	 * </p>
	 * <p>
	 * When we subtract "8 - 2" to find the complete array, we are actually doing
	 * <code>[1, 2, 3, 4, 5, 6, 7, 8] <b>-</b> [1, 2] <b>=</b> [3, 4, 5, 6, 7, 8]</code>.
	 * We end up with an array of 6 elements because the subtraction removed
	 * <code>[2]</code>, which is part of <code>[2, 3, ?, ?, 6, ?, 8]</code>.
	 * </p>
	 */
	int makeArrayConsecutive2(int[] statues) {
		Arrays.sort(statues);

		return statues[statues.length - 1] - statues[0] + 1 - statues.length;
	}

	/**
	 * Streams version. Not sort needed.
	 */
//	int makeArrayConsecutive2(int[] statues) {
////		return Arrays.stream(statues).max().getAsInt() - Arrays.stream(statues).min().getAsInt() + 1 - statues.length;
//		return IntStream.of(statues).max().getAsInt() - IntStream.of(statues).min().getAsInt() + 1 - statues.length;
//	}

}
