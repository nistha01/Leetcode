class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            int result = target-nums[i];
            if(map.containsKey(result))
            return new int[]{i,map.get(result)};

             map.put(nums[i],i);
        }
       
      return null;
    }
    
}