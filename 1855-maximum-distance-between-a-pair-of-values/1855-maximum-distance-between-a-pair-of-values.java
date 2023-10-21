class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
       int p1=0;
       int p2=0;
       int max=0;
       while(p1<nums1.length &&p2<nums2.length){
           if(nums2[p2]>=nums1[p1]) p2++;
           else if(nums2[p2]<=nums1[p1]) p1++;
           else{p1++;p2++;}
           max=Math.max(max,p2-p1-1);
       } 
       return max;
    }
}