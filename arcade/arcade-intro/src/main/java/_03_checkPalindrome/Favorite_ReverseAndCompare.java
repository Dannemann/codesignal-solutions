package _03_checkPalindrome;

class Favorite_ReverseAndCompare extends AbstractSolution {

	boolean checkPalindrome(String inputString) {
		return inputString.equals(new StringBuilder(inputString).reverse().toString());
	}

}
