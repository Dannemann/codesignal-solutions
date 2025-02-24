package codesignal.arrays.firstDuplicate;

class Favorite_Solution2 {

    int firstDuplicate(int[] a) {
        for (int v : a) {
            int p = Math.abs(v) - 1;

            if (a[p] < 0)
                return Math.abs(v);

            a[p] *= -1;
        }

        return -1;
    }

}
