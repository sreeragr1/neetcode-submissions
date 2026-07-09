class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>a= new HashMap<>();
        for(String x : strs){
            char [] arr= x.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            a.putIfAbsent(sorted,new ArrayList<>());

            
            a.get(sorted).add(x);
            
            
        }
        return new ArrayList<>(a.values());
        
    }
}
