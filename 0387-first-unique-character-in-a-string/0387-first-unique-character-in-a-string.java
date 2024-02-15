class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int n= s.length();
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(map.containsKey(ch)){
                int k=map.get(ch);
                k++;
                map.put(ch,k);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int k=map.get(ch);
            if(k==1)return i;
            
        }
        return -1;
    }
}