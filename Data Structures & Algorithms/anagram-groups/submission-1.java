class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String> > map = new HashMap<>();
        for(String x :strs){

            char [] y =  x.toCharArray();
            Arrays.sort(y);
            String sorted = new String(y) ;

            map.putIfAbsent(sorted,new ArrayList<>());
            map.get(sorted).add(x);



        
            

        }
        return new ArrayList<>(map.values());
        
    }
}
