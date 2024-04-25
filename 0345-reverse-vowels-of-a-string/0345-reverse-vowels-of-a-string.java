class Solution {
    public Boolean isVowel(char c){
        if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')return true;
        else return false;
    }
    public String reverseVowels(String s) {
        int left=0;
        
        char[] arr=s.toCharArray();
        int right=arr.length-1;
        
        while(left<=right){
            char charLeft=arr[left];
            char charRight=arr[right];
            while((!isVowel(charLeft) || isVowel(charRight)==false) && left<right){
                if(!isVowel(charRight))
                right--;
                else if(!isVowel(charLeft)){
                    left++;
                }
            charLeft = arr[left];
            charRight = arr[right];
            }
           
            if (isVowel(charLeft) && isVowel(charRight)) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
            right--;
            left++;
        }
        String b = new String(arr);
        return b;
        
    }
}