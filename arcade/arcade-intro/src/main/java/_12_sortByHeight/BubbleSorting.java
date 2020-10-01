package _12_sortByHeight;

class BubbleSorting extends AbstractSolution {

	int[] sortByHeight(int[] a) {
		int aLen = a.length - 1;

		for (int i = 0; i < aLen; i++) {
			int k = aLen - i;

			for (int c = 0, n = 1; n <= k; n++) {
				int curr = a[c];
				int next = a[n];

				if (next != -1) {
					if (curr > next) {
						a[n] = curr;
						a[c] = next;
					}

					c = n;
				}
			}
		}

		return a;
	}

}
