class Solution {
    public int firstMissingPositive(int[] nums) {
      int i = 0;
        while(i < nums.length) {
            //for any number nums[i] ..correct position is nuber-1 ,like for 4 its position is 4-1=3
            int correctPosition = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correctPosition]) {

                int temp = nums[i];
                nums[i] = nums[correctPosition];
                nums[correctPosition] = temp;
            }
            else {
                i++;
            }
        }

 
        for(int j = 0; j < nums.length; j++) {

            if(nums[j] != j + 1) {
                return j + 1;
            }
        }

    //if every element is at its correct index, then obviously the first
    //missing positive integer is nums.length + 1

        return nums.length + 1;
    }
}