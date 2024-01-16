class Solution {
    public int titleToNumber(String col) {
         int ans=0;
       for(int i=0;i<col.length();i++)
           ans= ans*26+col.charAt(i)-'A'+1;
        return ans;
        
    }
}