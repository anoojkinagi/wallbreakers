class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length == 0)
        {
            return 0;
        }
        int min = prices[0];
        int diff = 0;
        
        for(int i=0; i<prices.length-1; i++)
        {
            
             if(prices[i]<min)
             {
                 min = prices[i];
             }
             if(prices[i+1] - min > diff)
             {
                 diff = prices[i+1] - min;
             }
        }
        return diff;
    }
}