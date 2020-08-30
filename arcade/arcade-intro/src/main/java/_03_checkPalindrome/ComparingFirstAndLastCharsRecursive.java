package _03_checkPalindrome;

class ComparingFirstAndLastCharsRecursive extends AbstractSolution {

	boolean checkPalindrome(String inputString) {
		int len = inputString.length();

		if (len-- < 2)
			return true;

		if (inputString.charAt(0) != inputString.charAt(len))
			return false;

		return checkPalindrome(inputString.substring(1, len));
	}

}
