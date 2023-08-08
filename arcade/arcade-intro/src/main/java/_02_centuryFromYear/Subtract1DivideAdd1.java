package _02_centuryFromYear;

class Subtract1DivideAdd1 extends AbstractSolution {

	/**
	 * <p>
	 * It would be simple to calculate the century if we just had to integer-divide
	 * the year by 100 and add 1, but there is one exception: years that end in
	 * '00', like 1900 and 2000. But there is a way to eliminate this exception, and
	 * that's what this solution does. We will always be able to add 1 after the
	 * division.
	 * </p>
	 * <p>
	 * By subtracting 1 from the year, we guarantee that the division by 100 will
	 * always be within the range of <code>century - 1</code>. For example, 1900
	 * will become 1899 and return 18. 1801 will become 1800 and also return 18,
	 * covering the whole century range and eliminating the exception, making adding
	 * 1 always work (resulting in 19 in this case). For 1800, the return would be
	 * 17, and so on.
	 * </p>
	 * <p>
	 * <b>That's how you visualize this equation.</b> It solves the problem of years
	 * ending in '00', making adding 1 always work. It is a trick to keep the
	 * division by 100 within 1800-1899 or 2000-2099, for example.
	 * </p>
	 */
	int centuryFromYear(int year) {
		return (year - 1) / 100 + 1;
	}

}
