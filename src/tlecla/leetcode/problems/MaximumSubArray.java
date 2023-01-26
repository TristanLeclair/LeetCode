package tlecla.leetcode.problems;

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
