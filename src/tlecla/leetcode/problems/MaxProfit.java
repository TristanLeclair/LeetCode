package tlecla.leetcode.problems;

import javax.swing.text.StyleContext;

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
