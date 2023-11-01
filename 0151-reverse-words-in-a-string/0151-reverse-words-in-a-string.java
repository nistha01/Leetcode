class Solution {
    public String reverseWords(String str) {
        String[] strArray =  str.trim().split("\\s+");
       
        String ans="";
     
     
        for(int k=strArray.length-1;k>=1;k--){
            ans+=strArray[k]+" ";
        }
      return  ans+strArray[0];
        
    }
}