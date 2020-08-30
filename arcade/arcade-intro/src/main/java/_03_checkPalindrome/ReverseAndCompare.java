package _03_checkPalindrome;

class ReverseAndCompare extends AbstractSolution {

	boolean checkPalindrome(String inputString) {
		return inputString.equals(new StringBuilder(inputString).reverse().toString());
	}

}
