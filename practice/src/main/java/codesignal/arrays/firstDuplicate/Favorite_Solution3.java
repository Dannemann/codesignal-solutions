package codesignal.arrays.firstDuplicate;

class Favorite_Solution3 {

    // I did not see that the biggest value in the array is actually >= than the array's length (and the smallest >= 1).
    // The biggest possible value is not 100000, it is a.length: 1 ≤ a[i] ≤ a.length.

    int firstDuplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int v = Math.abs(a[i]) - 1;

            if (a[v] < 0)
                return Math.abs(a[i]);

            a[v] = -a[v];
        }

        return -1;
    }

}
