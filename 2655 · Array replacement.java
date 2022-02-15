// SUSHANT SINHA

// 1144ms 18.30mb 95.57%

import java.util.*;

public class Solution {
    public int[] replacement(int[] arr1, int[] arr2) {
        // -- write your code here --

        int index=arr1.length-arr2.length;

        for(int i:arr2){
            arr1[index++]=i;
        }

        return arr1;
		
    }
}