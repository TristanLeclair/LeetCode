package tlecla.leetcode.problems;

public class FindMinimumInRotatedSortedArray {
  public int findMin(int[] nums) {
    return findMin(nums, 0, nums.length - 1, Integer.MAX_VALUE);
  }

  private int findMin(int[] nums, int left, int right, int min) {
    min = Math.min(min, nums[left]);
    if (left == right) return min;
    int mid = (left + right) / 2;
    if (nums[mid] > nums[left]) {
      return findMin(nums, Math.min(mid + 1, right), right, min);
    } else {
      return findMin(nums, left, Math.min(mid - 1, left), min);
    }
  }
}
