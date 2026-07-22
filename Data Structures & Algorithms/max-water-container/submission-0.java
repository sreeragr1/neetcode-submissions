class Solution {
    public int maxArea(int[] heights) {

        int i =0;
        int j=heights.length-1;
        int maxval =0;
        while(i<j){
            int height = Math.min(heights[i],heights[j]);
            int width = j-i;
            int val = height*width;
            maxval = Math.max(maxval,val);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }





        }
        return maxval;
        


        
        





        
    }
}

 






