package easy;

//122. Best Time to Buy and Sell Stock II
//这题和1不一样的点在于可以当天卖了当天再买，所以只要有利润差价就可以买卖
public class BestTimetoBuyandSellStockII {
	 public int maxProfit(int[] prices) {
	        int maxprofit = 0;
	        for (int i = 1; i < prices.length; i++) {
	            if (prices[i] > prices[i - 1])
	                maxprofit += prices[i] - prices[i - 1];
	        }
	        return maxprofit;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
