class Solution {
    public String reverseWords(String str) {
      
        String[] arr= str.trim().split("\\s+");
        StringBuilder sb= new StringBuilder();
        
        
        for(int i=arr.length-1;i>0;i--){
            sb.append(arr[i]+" ");
        }
        String st= sb.toString();
        return st+arr[0];
        
    }
}