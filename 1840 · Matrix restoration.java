public class Solution {
    /**
     * @param n: the row of the matrix
     * @param m: the column of the matrix
     * @param after: the matrix
     * @return: restore the matrix
     */
    public int[][] matrixRestoration(int n, int m, int[][] after) {

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                if (i > 0) {
                    after[i][j] -= after[i - 1][j];
                }

                if (j > 0) {
                    after[i][j] -= after[i][j - 1];
                }

                if (i > 0 && j > 0) {
                    after[i][j] += after[i - 1][j - 1];
                }
            }
        }
        
        return after;
    }
}