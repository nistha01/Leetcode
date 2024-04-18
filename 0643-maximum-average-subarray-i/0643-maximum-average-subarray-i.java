class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        double sum=0.00;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double cur=sum;
      for(int i=1,j=k;j<nums.length;i++,j++){
         cur=cur-nums[i-1]+nums[j];
          sum=Math.max(cur,sum);
          
      }
        return sum/k;
    }
}