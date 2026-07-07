
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i =0;i< nums.length;i++){
            if(a.containsKey(nums[i])){
                return true;
            }
            else{
                a.put(nums[i],i+1);
            }
        }
        return false;
        
    }
}