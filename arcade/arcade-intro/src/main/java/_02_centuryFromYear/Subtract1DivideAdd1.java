package _02_centuryFromYear;

class Subtract1DivideAdd1 extends AbstractSolution {

    /**
     * <p>
     * By subtracting 1 from the year, we guarantee that the division by 100 will
     * always be within the range of <code>century - 1</code>. For example, 1900
     * will become 1899 and return 18. 1801 will become 1800 and also return 18,
     * covering the whole century range and eliminating the exception, making adding
     * 1 always work (resulting in 19 in this case). For 1800, the return would be
     * 17, and so on.
     * </p>
     * <p>
     * That's how you visualize this equation. It solves the problem of years ending
     * in '00', making adding 1 always work. It is a trick to keep the division by
     * 100 within 1800-1899, after subtracting 1 from 1801-1900 (19th century), for
     * example.
     * </p>
     */
    int centuryFromYear(int year) {
        return (year - 1) / 100 + 1;
    }

}
