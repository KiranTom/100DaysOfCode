class Solution {
    public int maxProfit(int[] prices) {
        
        int i; 
		int n = prices.length;
		int min = Integer.MAX_VALUE;
		int max = 0;
		
		for(i=0; i<n; i++) {
			
			if(prices[i] < min) {
				min = prices[i];
			}			
			else if(prices[i] - min > max) {
				max = prices[i] - min;
			}
		}
        return max;
    }
}