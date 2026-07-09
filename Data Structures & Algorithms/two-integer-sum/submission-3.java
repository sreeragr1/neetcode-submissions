class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int x= nums[i]+nums[j];
                if(x==target){
                    int[]ans= {i,j};
                    return ans;
                }
            }
        }
        return null;
        
    }
}
