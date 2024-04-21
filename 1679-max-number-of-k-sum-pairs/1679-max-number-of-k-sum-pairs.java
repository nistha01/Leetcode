class Solution {
    public int maxOperations(int[] arr, int k) {
      Arrays.sort(arr);
      int i=0;
        int j=arr.length-1;
        int ans=0;
        while(i<j){
           if(arr[i]+arr[j]==k){
               ans++;
               i++;
               j--;
           } 
            else if(arr[i]+arr[j]>k){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}