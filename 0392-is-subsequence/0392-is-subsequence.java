class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> stk= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            stk.add(ch);
        }
        if(stk.isEmpty())return true;
        for(int i=t.length()-1;i>=0;i--){
            char ch=t.charAt(i);
            
            if(!stk.isEmpty() && stk.peek()==ch)stk.pop();
        }
        if(stk.isEmpty())return true;
        return false;
        
        
    }
}