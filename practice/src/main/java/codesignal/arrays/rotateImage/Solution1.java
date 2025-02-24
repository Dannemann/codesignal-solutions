package codesignal.arrays.rotateImage;

public class Solution1 {

    int[][] rotateImage(int[][] a) {
        int length = a.length;
        int[][] b = new int[length][length];
        int vertical = length - 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++)
                b[j][vertical] = a[i][j];

            vertical--;
        }

        return b;
    }

}
