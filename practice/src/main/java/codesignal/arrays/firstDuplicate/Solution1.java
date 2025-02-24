package codesignal.arrays.firstDuplicate;

class Solution1 {

    int firstDuplicate(int[] a) {
        /*int biggest = 0;

        for (int v : a)
            if (v > biggest)
                biggest = v;

        int[] b = new int[biggest + 1];*/ // +1 to prevent ArrayIndexOutOfBoundsException with the higher number.

        // By the problem description constraints, we already know the maximum value (100000) and don't need to find it with the code above.
        // Edit after realize it: The constraint is that the biggest number in the array is <= the array length. I could have done:
        //    int[] b = new int[a.length + 1];

        int[] b = new int[100000 + 1]; // +1 to prevent ArrayIndexOutOfBoundsException with the higher number.

        for (int v : a) {
            if (b[v] != 0) // 0 is a guaranteed constraint: 1 ≤ a[i] ≤ a.length
                return v;

            b[v] = v;
        }

        return -1;
    }

}
