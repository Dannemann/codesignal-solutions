package _11_isLucky;

class ComparingHalfs extends AbstractSolution {

	boolean isLucky(int n) {
		String s = Integer.toString(n);
		int sLenHalf = s.length() / 2;

		return s.substring(0, sLenHalf).chars().sum() == s.substring(sLenHalf).chars().sum();
	}

}
