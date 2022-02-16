// SUSHANT SINHA

// 1933ms 29.48mb 17.65%

public class Solution {
    /**
     * @param arr: the line 
     * @param k: Alex place
     * @return: the time when Alex requires to buy all passes
     */
    public int buyPasses(int[] arr, int k) {
        // Write your code here.

        int ans = 0;

        while (arr[k] != 0) {

            for (int index = 0; index < arr.length; index++) {

                if (arr[index] > 0) {
                    ans++;
                    arr[index]--;
                    if (arr[k] == 0)
                        return ans;
                }
            }

        }

        return ans;
    }
}