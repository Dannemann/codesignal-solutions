package _01_add;

class Favorite_BitShifting extends AbstractSolution {

	int add(int param1, int param2) {
		while (param2 != 0) {
			int carry = param1 & param2;
			param1 = param1 ^ param2;
			param2 = carry << 1;
		}

		return param1;
	}

}
