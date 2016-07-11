package leetcode;

/**
 * Best Time to Buy and Sell Stock
 *
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 */
public class Q121 {
	public static void main(String[] args) {
		new Q121().maxProfit(new int[] { 3, 1, 2, 5, 7, 3 });
	}

	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		int curMin = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < curMin) {
				curMin = prices[i];
			}
			maxProfit = prices[i] - curMin > maxProfit ? prices[i] - curMin : maxProfit;
		}
		return maxProfit;
	}
}
