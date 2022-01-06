public class Solution {
    /**
     * @param str: The first string given
     * @param sub: The given second string
     * @return: Returns the deleted string
     */
    public String CharacterDeletion(String str, String sub) {
        // write your code here

        boolean isPresent[]=new boolean[256];

        for(char c:sub.toCharArray()){
            isPresent[c]=true;
        }

        StringBuffer sBuff=new StringBuffer();

        for(char c:str.toCharArray()){

            if(!isPresent[c])
            sBuff.append(c);

        }

        return String.valueOf(sBuff);

    }
}