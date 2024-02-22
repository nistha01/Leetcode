class Solution {
    public boolean isValid(String s) {
      Stack<Character> stk= new Stack<>();
     int n = s.length();
     for(int i=0;i<n;i++){
         char ch= s.charAt(i);
         if(ch=='(' || ch=='[' || ch=='{'){
             stk.push(ch);
         }
         else {
             if(stk.size()==0)return false;
              if(ch==']' && stk.peek()!='[')return false;
              if(ch=='}' && stk.peek()!='{')return false;
              if(ch==')' && stk.peek()!='(')return false;
             stk.pop();
         }
     }
        return stk.isEmpty();
       
    }
}