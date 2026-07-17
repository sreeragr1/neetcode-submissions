class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map = new HashMap<>();
        for(String x : strs){
            char[]ch = x.toCharArray();
            Arrays.sort(ch);
            String key =  new String (ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(x);
        }
        return new ArrayList<>(map.values());
        
    }
}
