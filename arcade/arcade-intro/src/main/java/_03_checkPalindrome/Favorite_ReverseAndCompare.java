package _03_checkPalindrome;

class Favorite_ReverseAndCompare extends AbstractSolution {

	boolean checkPalindrome(String inputString) {
		return inputString.contentEquals(new StringBuilder(inputString).reverse());
	}

}
