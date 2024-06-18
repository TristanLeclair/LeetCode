package tlecla.leetcode.problems;

import java.util.Arrays;

public class MaxNumberKSumPairs {
  public static int maxOperations(int[] nums, int k) {
    Arrays.sort(nums);
    int left = 0, right = nums.length - 1;
    int operations = 0;
    while (left < right) {
      if (nums[left] + nums[right] == k) {
        ++operations;
        ++left;
        --right;
      } else if (nums[left] + nums[right] > k) {
        --right;
      } else {
        ++left;
      }
    }
    return operations;
  }

  public static void main(String[] args) {
    System.out.println(MaxNumberKSumPairs.maxOperations(new int[]{1, 2, 3, 4}, 5));
    System.out.println(MaxNumberKSumPairs.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
  }
}
