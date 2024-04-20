class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int n= arr[i];
            if(map.containsKey(n)){
                int k=map.get(n);
                k++;
                map.put(n,k);
            }
            else{
                map.put(n,1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
       for(int count : map.values()) {
            if(set.contains(count)) {
                return false; 
            }
            set.add(count);
        }
        
        return true; 
    }
}