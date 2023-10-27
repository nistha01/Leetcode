class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // if(nums.length==1 || nums.length==2)return 
        int num1=0;
        int num2=0;
        int c1=0;
        int c2=0;
        List<Integer> list=new ArrayList<>();
        for(int ele:nums){
            if(ele==num1)c1++;
            else if(ele==num2)c2++;
            else if(c1==0){
                num1=ele;
                c1=1;
            }
            else if(c2==0){
                num2=ele;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int num:nums){
            if(num==num1)c1++;
            else if(num==num2)c2++;
        }
        if(c1>nums.length/3)list.add(num1);
        if(c2>nums.length/3)list.add(num2);
        return list;
            
    }
}