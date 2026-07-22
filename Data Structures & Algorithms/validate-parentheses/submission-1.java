class Solution {
    public boolean isValid(String s) {
        Stack<Character> result = new Stack<>();
        for(char x : s.toCharArray()){
            if( x == '(' || x =='{' || x=='['){
                result.push(x);

            }
            else{
                if(result.isEmpty())return false;

                char top= result.pop();

                if(x==')' && top!='(')return false;
                if(x=='}' && top!='{')return false;
                if(x==']' && top!='[')return false;


            }
            
            
        }
return result.isEmpty();

        
    }
}
