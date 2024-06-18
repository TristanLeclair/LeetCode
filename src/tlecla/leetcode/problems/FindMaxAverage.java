package tlecla.leetcode.problems;

public class FindMaxAverage {
  public static double findMaxAverage(int[] nums, int k) {
    if (nums == null || nums.length < k) return 0;

    double sum = 0;
    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }

    double maxSum = sum;

    for (int i = k; i < nums.length; i++) {
      sum -= nums[i - k] + nums[i];
      maxSum = Math.max(maxSum, sum);
    }
    return maxSum / k;
  }

  public static void main(String[] args) {
    System.out.println(FindMaxAverage.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
  }
}
