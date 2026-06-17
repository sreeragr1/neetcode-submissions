class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character,Integer>sh= new Hashtable<>();
        Hashtable<Character,Integer>th = new Hashtable<>();
        for(char c :s.toCharArray()){
            
            if(sh.containsKey(c)){
                
                int count = sh.get(c);
                sh.put(c,count+1);
            }
            else {
                sh.put(c,1);
            }


        
        }
        for(char c :t.toCharArray()){
            
            if(th.containsKey(c)){
               
                int count = th.get(c);
                 th.put(c,count+1);
            }
            else {
                th.put(c,1);
            }



        
        }
        if(sh.equals(th)){
            return true;
        }
        else{
            return false;
        }

    }
}
