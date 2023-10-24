class Solution {  
    public void reverse(char[] arr,int i,int j){
          while(i<j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    }
    public String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        int i=0;
        int n =ch.length;
        while(i<n){
            int j=Math.min(i+k-1,n-1);
            reverse(ch,i,j);
            i+=2*k;
        }
        String str=new String(ch);
        return str;
           
    }
       
}