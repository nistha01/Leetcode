class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
      PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])) { 
                pq.add(nums[i]);
                set.add(nums[i]);
            }
        }
        int len=1;
        int count=1;
        int prev = Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            int n=pq.poll();
            if(n==prev+1 ){
                count++;
            }
            else{
                count=1;
            }
            prev=n;
            len=Math.max(len,count);
          
           
                
        }
        return len;
    }
}