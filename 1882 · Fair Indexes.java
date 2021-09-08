
// similar to one of the leetcode questions, except, here two arrays are used

public class Solution {
    /**
     * @param A: an array of integers
     * @param B: an array of integers
     * @return: return a integer indicating the number of fair indexes.
     */
    public int CountIndexes(List<Integer> A, List<Integer> B) {
        
        int ans = 0;
        long sum_a = 0, sum_b = 0, pre_a = 0, pre_b = 0;

        for(int i = 0; i < A.size(); i++){

            sum_a += A.get(i);
            sum_b += B.get(i);
        }

        if(sum_a != sum_b)
            return 0;


        for(int i = 0; i < A.size() - 1; i++){

            pre_a += A.get(i);
            pre_b += B.get(i);
            if(pre_a==pre_b && pre_a == sum_a - pre_a)
                ans++;

        }
        
        return ans;
    }
}