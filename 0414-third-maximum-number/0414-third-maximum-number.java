class Solution {
    public int thirdMax(int[] nums) {
          PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(!set.contains(x)){
                set.add(x);
                maxpq.add(x);
            }
            else continue;
        }
        if(set.size()<3)return maxpq.poll();
        else{
            maxpq.poll();
            maxpq.poll();
            
        }
        
        return maxpq.poll();
      
        
    }
}