package _11_isLucky;

import java.util.stream.IntStream;

class SubtractingHalfs extends AbstractSolution {

	boolean isLucky(int n) {
		char[] s = Integer.toString(n).toCharArray();
		int halflen = s.length / 2;

		return IntStream.range(0, halflen).map(i -> s[i] - s[halflen + i]).sum() == 0;
	}

//	boolean isLucky(int n) {
//		char[] s = Integer.toString(n).toCharArray();
//		int halflen = s.length / 2;
//		int sum = 0;
//
//		for (int i = 0; i < halflen; i++)
//			sum += s[i] - s[halflen + i];
//
//		return sum == 0;
//	}

}
