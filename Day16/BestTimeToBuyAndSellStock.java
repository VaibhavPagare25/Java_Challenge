class Solution {
    public int maxProfit(int[] prices) {
    
        int min = prices[0];
        int max = 0;
        int sell = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            sell = prices[i] - min;
            if(sell > max){
                max = sell;
            }
        }
        if(max <= 0){
            return 0;
        }
        else{
            return max;
        }
    }
}
            
