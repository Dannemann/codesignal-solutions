package _03_checkPalindrome;

class ManualReverseAndCompare extends AbstractSolution {

	boolean checkPalindrome(String inputString) {
		StringBuilder reversed = new StringBuilder();

		for (int i = inputString.length() - 1; i > -1; i--)
			reversed.append(inputString.charAt(i));

		return inputString.equals(reversed.toString());
	}

}
