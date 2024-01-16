class Solution {
    public char findTheDifference(String s, String t) {
     char[] arr1= s.toCharArray();
     char[] arr2= t.toCharArray();
        int sum1=0;
        int sum2=0;
     for(int i=0;i<arr1.length;i++){
         char ch= arr1[i];
         sum1+=(int)ch;
     }
         for(int i=0;i<arr2.length;i++){
         char ch= arr2[i];
         sum2+=(int)ch;
     }
        int x=sum2-sum1;
        char ch=(char)x;
        return ch;
    }
}