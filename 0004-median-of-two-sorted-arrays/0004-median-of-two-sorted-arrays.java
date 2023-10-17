class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
    double ans=0;
    int m = arr1.length;
    int n = arr2.length;
    int[] merged = new int[m + n];
    int i = 0, j = 0, k = 0;

    while (i < m && j < n) {
        if (arr1[i] < arr2[j]) {
            merged[k] = arr1[i];
            i++;
        } else {
            merged[k] = arr2[j];
            j++;
        }
        k++;
    }

    // Copy the remaining elements from both arrays, if any
    while (i < m) {
        merged[k] = arr1[i];
        i++;
        k++;
    }
    while (j < n) {
        merged[k] = arr2[j];
        j++;
        k++;
    }

    


       if((m+n)%2!=0) return merged[(m+n)/2];
        else{
            int a = (m+n)/2;
            int b = a-1;
            double x = merged[a];
            double y = merged[b];
            return (x+y)/2;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}