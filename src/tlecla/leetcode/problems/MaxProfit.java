package tlecla.leetcode.problems;

/**
 * 121. Best Time to Buy and Sell Stock
 * <p>
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">LeetCode link</a>
 */
public class MaxProfit {
  public int maxProfit(int[] prices) {
    int minVal = prices[0];
    int maxProfit = 0;
    for(int price: prices) {
      if (price < minVal) {
        minVal = price;
      } else {
        maxProfit = Math.max(maxProfit, price - minVal);
      }
    }
    return maxProfit;
  }
}
