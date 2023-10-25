class Solution {
    public boolean canPlaceFlowers(int[] arr, int p) {
        int n = arr.length;
        if(n==1 && arr[0]==0)return true;
        int count=0;
        if(arr[0]==0 && arr[1]==0)
        {
            arr[0]=1;
             count+=1;
        }
        
        for(int i=1;i<n-1;i++){
            if(arr[i-1]!=1 && arr[i]!=1 && arr[i+1]!=1){
                arr[i]=1;
                count++;
            }
            
        }
        if(arr[n-1]==0 && arr[n-2]==0 && n>2)count++;
       if(count>=p){
           return true;
       } 
        return false;
    }
}