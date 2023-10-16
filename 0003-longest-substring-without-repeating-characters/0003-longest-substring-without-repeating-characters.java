class Solution {
    public int lengthOfLongestSubstring(String s) {
     int n = s.length();
     HashSet<Character> set = new HashSet<>();
     int pt1=0;
     int pt2=0;
     int maxSize=0;
     while(pt1<n && pt2<n){
         char ch = s.charAt(pt1);
         char ch2=s.charAt(pt2);
         if(set.contains(ch)){
             
             set.remove(ch2);
             pt2++;
            
         }
         else{
             set.add(ch);
             pt1++;
         }
          maxSize=Math.max(maxSize,set.size());
     }
     return maxSize;
    }
}