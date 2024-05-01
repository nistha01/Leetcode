class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int i=0;
        int j=0;
        String s="";
        while(i<word1.length() && j<word2.length()){
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(j);
            s=s+ch1;
            s=s+ch2;
            i++;
            j++;
        }
        if(i<=word1.length()-1){
            while(i<word1.length()){
                char ch= word1.charAt(i);
                s=s+ch;
                i++;
            }
        }
        else if(j<=word2.length()-1){
            while(j<word2.length()){
                char ch= word2.charAt(j);
                s=s+ch;
                j++;
            }
        }
        return s;
    }
}