package tlecla.leetcode.problems;

import java.util.Arrays;

/**
 * 152. Maximum Product Subarray
 * <p>
 * <a href="https://leetcode.com/problems/maximum-product-subarray/">LeetCode link</a>
 */
public class MaximumProductArray {
  /*
  Takes the max and the min of each contiguous subarray because min could be a negative number,
  which when multiplied by another negative number may become bigger than the max

  [ -1, -2, -3, -4 ]
         -> [2,-2]
            -> [6, -6]
                -> [24, -24]
                  ...
   */
  public int maxProduct(int[] nums) {
    int minVal = 1;
    int maxVal = 1;
    int result = Arrays.stream(nums).max().getAsInt();
    for (int x : nums) {
      if (x == 0) {
        minVal = 1;
        maxVal = 1;
        continue;
      }
      var maxTimesCurr = x * maxVal;
      var minTimesCurr = x * minVal;
      maxVal = Math.max(maxTimesCurr, Math.max(minTimesCurr, x));
      minVal = Math.min(maxTimesCurr, Math.min(minTimesCurr, x));
      result = Math.max(result, maxVal);
    }
    return result;
  }
}
