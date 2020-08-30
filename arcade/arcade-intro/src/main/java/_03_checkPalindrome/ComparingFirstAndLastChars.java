package _03_checkPalindrome;

class ComparingFirstAndLastChars extends AbstractSolution {

	boolean checkPalindrome(String inputString) {
		int len = inputString.length();
		int halfLen = len / 2;
		int lenMinus1 = len - 1;

		for (int i = 0; i < halfLen; i++)
			if (inputString.charAt(i) != inputString.charAt(lenMinus1 - i))
				return false;

		return true;
	}

}
