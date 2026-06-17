class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length==0){
            return false;
        }
        int a =0;
        int x = nums[a];
        for(int i=a+1;i<nums.length;i++){
            if(x == nums[i]){
                return true;
            }
            if((i == nums.length - 1) && (a < nums.length)){
                a++;
                i=a;
                x=nums[a];



            }


        }
        return false;
        
    }
}