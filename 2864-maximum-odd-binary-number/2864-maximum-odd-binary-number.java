class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len=s.length();
        int count =0;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                count++;
            }
        }
        int pt=count-1;
        String st="";
        while(pt>0){
            st=st+1;
            pt--;
        }
        while(st.length()!=s.length()-1){
            st=st+0;
        }
        return st+1;
    }
}