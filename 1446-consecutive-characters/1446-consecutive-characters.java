class Solution {
    public int maxPower(String s) {
        int n = s.length();
        int i=1;
        int currentpow=1;
        int maxpow=1;
        while(i<n ){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i-1);
            if(ch1==ch2){
                currentpow++;
               
            }
            else{
                currentpow=1;
            }
            i++;
            maxpow=Math.max(currentpow,maxpow);
        }
        
        return maxpow;
    }
}