package codesignal.arrays.firstDuplicate;

import java.util.LinkedHashSet;

class Solution5 {

    int firstDuplicate(int[] a) {
        LinkedHashSet s = new LinkedHashSet();

        for (int v : a)
            if (!s.add(v))
                return v;

        return -1;
    }

}
