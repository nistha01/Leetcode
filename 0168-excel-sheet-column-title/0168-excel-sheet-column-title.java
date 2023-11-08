class Solution {
    public String convertToTitle(int colNumber) {
        StringBuilder res = new StringBuilder();
        while(colNumber>0){
            colNumber--;
            int chr=colNumber%26;
            res=res.append((char)('A'+chr));
            colNumber/=26;
        }
          res.reverse();
        return res.toString();
        
    }
}