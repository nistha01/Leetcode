class Solution {
    public int calculate(String s) {
        Stack<Integer> stk= new Stack<>();
        int n = s.length();
        char sign='+';
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            
            if(Character.isDigit(s.charAt(i))){
                int val =0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    val=val*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                if(sign=='+'){
                    stk.push(val);
                }
                else if(sign=='-'){
                    stk.push(-val);
                }
                else if(sign=='*'){
                    int k = stk.pop();
                    int ans=k*val;
                    stk.push(ans);
                }
                else if(sign=='/'){
                    int k = stk.pop();
                    int ans=k/val;
                    stk.push(ans);
                }
            }
            else if(ch!=' '){
                sign=ch;
            }
        }
        int sum=0;
        while(!stk.isEmpty()){
            sum+=stk.pop();
        }
        return sum;
        
    }
}