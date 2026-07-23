class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int maxprofit =0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buyprice){
                buyprice = prices[i];
            }
            else{
                int currentprofit = prices[i]-buyprice;
                maxprofit = Math.max(currentprofit,maxprofit);



            }
        }
        return maxprofit;

        
    }
}
