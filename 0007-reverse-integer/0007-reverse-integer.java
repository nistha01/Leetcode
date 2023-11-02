class Solution {
    public int reverse(int y) {
        long x= Math.abs(y);
        long ans = 0;
        while(x>0){
            long k= x%10;
            ans = ans*10+k;
            x=x/10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)
        return 0;
        if(y<0){
            return (int)(-1*ans);
        }
        else
        return (int)(ans);
     
    }
}