package _03_checkPalindrome;

class BadHalfsComparation extends AbstractSolution {

	/**
	 * This solution makes no sense as it needs to reverse the half to compare to
	 * the other half. It's just easier to reverse the entire string and compare to
	 * the original one. It is here just for documentation.
	 */
	boolean checkPalindrome(String inputString) {
		int len = inputString.length();
		int halfLen = len / 2;
		String firstHalf = inputString.substring(0, halfLen);
		String secondHalf = len % 2 == 0 ? inputString.substring(halfLen) : inputString.substring(halfLen + 1);

		return firstHalf.contentEquals(new StringBuilder(secondHalf).reverse());
	}

}
