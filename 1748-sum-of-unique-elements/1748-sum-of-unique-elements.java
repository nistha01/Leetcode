class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int sum=0;
     while(i<nums.length && j< nums.length){
         while(i<nums.length && nums[i]==nums[j]){
             i++;
         }
         if(i-j==1){
             sum+=nums[j];
         }
         j=i;
     }
        return sum;
    
    }
}