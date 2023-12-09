class Solution {
    public String sortVowels(String s) {
        char[] arr=s.toCharArray();
        ArrayList<Character> vowels=new ArrayList<>();
        ArrayList<Integer> vowelsIndex=new ArrayList<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'|| ch=='a'|| ch=='e' || ch=='i' ||ch=='o' || ch=='u'){
                vowels.add(ch);
            
                vowelsIndex.add(i);
                
            }
            else{
                continue;
            }
                
                
        }
        Collections.sort(vowels);
       
         char[] resultArray = s.toCharArray();
        for (int i = 0; i < vowelsIndex.size(); i++) {
            resultArray[vowelsIndex.get(i)] = vowels.get(i);
        }
        
        return new String(resultArray);
    }
}