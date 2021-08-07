// SUSHANT SINHA

public class Solution {
    /**
     * @param s: a string
     * @return: whether the student could be rewarded according to his attendance record
     */
    public boolean checkRecord(String s) {
        // Write your code here
        int a=0,l=0;

        for(char c:s.toCharArray()){
            if(c=='A'){
                a++;
                if(a==2)
                return false;
                l=0;
            }
            
            else if(c=='L'){
                l++;
                if(l==3)
                return false;
            }

            else
                l=0;
            
        }

        return true;

    }
}