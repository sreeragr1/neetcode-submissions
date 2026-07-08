class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character ,Integer> a = new HashMap<>();
        HashMap<Character ,Integer> b = new HashMap<>();
        int i =0;
        
        for(char x : s.toCharArray() ){
            a.put(x,a.getOrDefault(x,0)+1);
            
            
        }
        for(char x: t.toCharArray()){
            b.put(x,b.getOrDefault(x,0)+1);
        }
        if(a.equals(b)){
            return true;

        }
        else {
            return false;
        }




    }
}