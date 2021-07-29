// SUSHANT SINHA

// 525ms 8.91mb ( 93.43% )

public class Solution {
    /**
     * @param str: Arbitrary length string
     * @return How many numbers are in the string
     */
    public int statistics(String str) {
        // write your code here
        int ans=0;

        for(char c:str.toCharArray()){
            if(Character.isDigit(c))
            ans++;
        }

        return ans;
    }
}