package easy;

import java.util.Arrays;

//121. Best Time to Buy and Sell Stock
public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices){
		//标记每一位上的最大利润
		if(prices.length==0) return 0;
		int[] max = new int[prices.length];
		for(int i=0;i<prices.length;i++){
			int eachMax=prices[i];
			for(int j=i;j<prices.length;j++){
				if(prices[j]>eachMax) eachMax = prices[j];
			}
			//该位置和以后最大值的利润差
			max[i] = eachMax - prices[i];
		}
		Arrays.sort(max);
		//返回最大利润差
		return max[prices.length-1];
	}
	
	public int maxProfit2(int[] prices) {       
        if (prices.length == 0)
        {
            return 0;
        }       
        int max = 0, min = prices[0];
        int profit = 0;        
        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] < min)
            {                
                min = prices[i];
            }
            else
            {
                if (prices[i] - min > profit)
                {
                    profit = prices[i] - min;
                }              
            }
        }
          
     return profit;   
    }
	
	public static void main(String []args){
		int[] prices = {7, 6, 4, 3, 1};
		BestTimetoBuyandSellStock b = new BestTimetoBuyandSellStock();
		System.out.println(b.maxProfit(prices));
	}

}
