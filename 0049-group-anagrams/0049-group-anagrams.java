class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //create hashmap of 
        //key will be hashmap inside this will be frequency map
        HashMap<HashMap<Character,Integer>,ArrayList<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            HashMap<Character,Integer> mapIn=new HashMap<>();
            String str=strs[i];
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                if(mapIn.containsKey(ch)){
                 int k=  mapIn.get(ch);
                    k++;
                    mapIn.put(ch,k);
                }
                else{
                    mapIn.put(ch,1);
                }
            }
            if(map.containsKey(mapIn)){
                ArrayList<String> arr= map.get(mapIn);
                arr.add(str);
                map.put(mapIn,arr);
            }
            else{
                ArrayList<String> arrNew=new ArrayList<>();
                arrNew.add(str);
                map.put(mapIn,arrNew);
            }
        }
         List<List<String>> result = new ArrayList<>();
        
        for (ArrayList<String> stringsList : map.values()) {
            result.add(stringsList);
        }
        
        return result;
        
    }
}