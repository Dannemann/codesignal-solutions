package _06_makeArrayConsecutive2;

import java.util.Arrays;

class TrickySubtractionOnEachElement extends AbstractSolution {

	/**
	 * <p>
	 * <b>To visualize this solution:</b> First, you need to completely understand
	 * the explanation of {@link Favorite_TrickySubtraction} solution. Notice that something
	 * similar is happening here with the difference that
	 * "<code>statues[i] - statues[i - 1] - 1</code>" is used to find the number of
	 * missing elements <b>between the elements in the array</b>. The last
	 * "<code> - 1</code>" is the catch.
	 * </p>
	 * <p>
	 * For instance, take the array <code>[6, 2, 3, 8]</code> which can be sorted to
	 * <code>[2, 3, 6, 8]</code>. This solution algorithm will execute:
	 * </p>
	 * <p>
	 * &emsp;3 - 2 - 1 = 0<br>
	 * &emsp;6 - 3 - 1 = 2<br>
	 * &emsp;8 - 6 - 1 = 1
	 * </p>
	 * <p>
	 * Remember that actual mathematical subtraction is used to remove an amount of
	 * numbers from another amount of numbers <b>and not</b> to find numbers between
	 * numbers (but it help us to get close). In the example above, "6 - 3" will
	 * remove the numbers "1, 2, 3" from "1, 2, 3, 4, 5, 6" but <b>will not remove
	 * the "6"</b>. The same case for "3 - 2". It removes "1, 2" from "1, 2, 3"
	 * <b>but does not remove the element "3"</b>. As we want to know how many
	 * numbers are <b>missing BETWEEN</b> 3 and 2, both of these numbers (including
	 * the 3) must be removed from the equation (but the "3" is not removed when
	 * using subtraction).
	 * </p>
	 */
	int makeArrayConsecutive2(int[] statues) {
		Arrays.sort(statues);

		int len = statues.length;
		int result = 0;

		for (int i = 1; i < len; i++)
			result += statues[i] - statues[i - 1] - 1;

		return result;
	}

	/**
	 * IntStream version.
	 */
//	int makeArrayConsecutive2(int[] statues) {
//		Arrays.sort(statues);
//
//		return IntStream.range(1, statues.length).map(i -> statues[i] - statues[i - 1] - 1).sum();
//	}

}
