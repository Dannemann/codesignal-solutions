package _12_sortByHeight;

class InsertionSorting extends AbstractSolution {

	int[] sortByHeight(int[] a) {
		int aLen = a.length;

		for (int i = 1; i < aLen; i++) {
			int key = a[i];

			if (key != -1) {
				int j = i - 1;
				int trees = 0;

				while (j > -1) {
					int val = a[j];

					if (val == -1)
						trees++;
					else if (val > key) {
						a[j + 1 + trees] = val;
						trees = 0;
					} else
						break;

					j--;
				}

				a[j + 1 + trees] = key;
			}
		}

		return a;
	}

}
