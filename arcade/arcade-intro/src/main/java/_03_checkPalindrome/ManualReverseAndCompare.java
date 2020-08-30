package _03_checkPalindrome;

class ManualReverseAndCompare extends AbstractSolution {

	boolean checkPalindrome(String inputString) {
		String reversed = "";

		for (int i = inputString.length() - 1; i > -1; i--)
			reversed += inputString.charAt(i);

		return inputString.equals(reversed);
	}

}
