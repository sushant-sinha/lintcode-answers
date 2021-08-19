// SUSHANT SINHA

// 529ms (71.65%) 8.96mb

import java.util.*;

public class Solution {
    /**
     * @param str: Limit the string to be longer than subStr
     * @param subStr: Strings shorter than str
     * @return subStr appears as an index array in Str
     */
    public int[] getIndexArray(String str, String subStr) {
        // write your code here

        ArrayList<Integer> ar=new ArrayList<>();

        for(int i=0;i<=str.length()-subStr.length();i++){
            if(str.substring(i,i+subStr.length()).equals(subStr))
                ar.add(i);
        }

        if(ar.size()==0)
            return new int[]{-1};

        else{
            
            int ans[]=new int[ar.size()];

            for(int i=0;i<ar.size();i++){
                ans[i]=ar.get(i);
            }

            return ans;
        }
    }
}
