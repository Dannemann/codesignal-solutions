package codesignal.arrays.firstDuplicate;

import java.util.Arrays;
import java.util.LinkedHashSet;

class Solution6 {

    int firstDuplicate(int[] a) {
        LinkedHashSet s = new LinkedHashSet();
        return Arrays.stream(a).filter(v -> !s.add(v)).findFirst().orElse(-1);
    }

}
