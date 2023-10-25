class Solution {
    public int maxArea(int[] arr) {
       int left=0;
       int right=arr.length-1;
       int maxArea=0;
       while(left<right){
           int area=(right-left)*Math.min(arr[left],arr[right]);
           maxArea= Math.max(maxArea,area);
           if(arr[right]<arr[left])
           right--;
           else
           left++;
       }
       return maxArea;
    }
}