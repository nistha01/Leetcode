class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)return false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1])return false;
        }
        int i=0;
        int j=arr.length-1;
        while(i<arr.length-1 && arr[i]<arr[i+1]){i++;}
        while(j>0 && arr[j]<arr[j-1]){j--;}
        if(i==0 && j==0)return false;
        if(j==arr.length-1 &&  i==arr.length-1)return false;
        if(i!=j)return false;
        return true;
        
    }
}