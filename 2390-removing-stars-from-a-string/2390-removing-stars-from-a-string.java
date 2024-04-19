class Solution {
    public String removeStars(String s) {
       Stack<Character> stk = new Stack<>();
        //StringBuilder input1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='*'){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
            else{
                stk.push(ch);
            }
        }
            String sp="";
            while(!stk.isEmpty()){
             char ch2=stk.pop();
           //  input1.append(ch2);
                sp=sp+ch2;
            }
        String input1="";
        for(int i=sp.length()-1;i>=0;i--){
            char c= sp.charAt(i);
            input1=input1+c;
        }
           
           return input1;
        
    }
}