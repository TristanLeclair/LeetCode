package tlecla.leetcode.problems;

import java.util.Arrays;

public class MoveZeroes {
  public static void moveZeroes(int[] nums) {
    if (nums.length < 2) return;
    int left = 0;
    int length = nums.length;
    for (int right = 0; right < length; right++) {
      if (nums[right] != 0) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
        left++;
      }
    }
  }

  public static void moveZeroes2(int[] nums) {
    int i = 0, n = nums.length;
    for (int x : nums) {
      if (x != 0) nums[i++] = x;
    }
    for (; i < n; i++) nums[i] = 0;
  }

  public static void main(String[] args) {
//    int[] nums = {0, 1, 0, 3, 12};
    int[] nums = {2, 1};
    MoveZeroes.moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
  }
}
