class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []left = new int[nums.length];
        int []right = new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;

        int x =1;
        int y= 1;
        for(int i=1;i<nums.length;i++){
            x = x* nums[i-1];
            left[i]=x;
        }
        for(int i=nums.length-2;i>=0;i--){
            y=y*nums[i+1];
            right[i]=y;
        }
        int []result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=left[i]*right[i];
        }
        return result;

        
    }
}  
