package easy;

//122. Best Time to Buy and Sell Stock II
//�����1��һ���ĵ����ڿ��Ե������˵�����������ֻҪ�������۾Ϳ�������
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
