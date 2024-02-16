class Solution {
    public int countBit(int n){
         int cnt=0;
            while(n!=0){
                cnt+=(n&1);
               n=n>>1; 
            }
           return cnt;
    }
    public int[] countBits(int n) {
        int[] arr= new int[n+1];
        arr[0]=0;
        for(int i=1;i<n+1;i++){
           arr[i]=countBit(i);
        }
        return arr;
    }
}