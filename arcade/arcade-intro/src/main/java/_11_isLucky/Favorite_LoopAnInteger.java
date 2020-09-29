package _11_isLucky;

class Favorite_LoopAnInteger extends AbstractSolution {

	boolean isLucky(int n) {
		int halfLen = ((int) Math.log10(n) + 1) / 2;
		int s = 0;

		for (int i = 0; i < halfLen; i++) {
			s += n % 10;
			n /= 10;
		}

		for (; n != 0; n /= 10)
			s -= n % 10;

		return s == 0;
	}

//	boolean isLucky(int n) {
//		int nLen = (int) Math.log10(n) + 1;
//		int halfLen = nLen / 2;
//		int s = 0;
//
//		for (int i = 0; i < nLen; i++) {
//			s = i < halfLen ? s + n % 10 : s - n % 10;
//			n /= 10;
//		}
//
//		return s == 0;
//	}

}
