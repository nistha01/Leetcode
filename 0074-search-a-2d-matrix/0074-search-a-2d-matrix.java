class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row=matrix.length;
        int col=matrix[0].length;
        int high=row*col-1;
        int low=0;
        while(low<=high){
            int midEle,midIdx,rowIdx,colIdx;
            midIdx=low+(high-low)/2;
            rowIdx=midIdx/col;
            colIdx=midIdx%col;
            midEle=matrix[rowIdx][colIdx];
            if(midEle==target)return true;
            else if(midEle<target)low=midIdx+1;
            else high=midIdx-1;
        }
        return false;
     
        
        
    }
}