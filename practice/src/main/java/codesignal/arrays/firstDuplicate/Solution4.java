package codesignal.arrays.firstDuplicate;

import java.util.HashSet;
import java.util.Set;

class Solution4 {

    int firstDuplicate(int[] a) {
        Set s = new HashSet();

        for (int v : a) {
            if (s.contains(v))
                return v;

            s.add(v);
        }

        return -1;
    }

}
