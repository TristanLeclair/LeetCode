package tlecla.leetcode.problems;

/**
 * 53. Maximum Subarray
 * <p>
 * <a href="https://leetcode.com/problems/maximum-subarray/">LeetCode link</a>
 */
public class MaximumSubArray {
  public int maxSubArray(int[] nums) {
    int currSum = nums[0];
    int maxSum = currSum;
    for (int i = 1; i < nums.length; i++) {
      int curr = nums[i];
      if(curr > currSum + curr) {
        currSum = curr;
      } else {
        currSum += curr;
      }
      maxSum = Math.max(maxSum, currSum);
    }
    return maxSum;
  }
}
