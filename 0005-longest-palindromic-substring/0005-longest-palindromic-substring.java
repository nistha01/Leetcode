class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==1)return s;
        String subString=s.substring(0,1);
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String st=s.substring(i,j+1);
                Boolean result= findPalindrome(st);
                if(result && st.length()>subString.length()){
                   subString=st; 
                }
            }
        }
        return subString;
  
    }
    public Boolean findPalindrome(String st){
        int i=0;
        int j=st.length()-1;
        while(i<j){
            if(st.charAt(i)!=st.charAt(j))return false;
            i++;
            j--;
        } return true;
    }
}