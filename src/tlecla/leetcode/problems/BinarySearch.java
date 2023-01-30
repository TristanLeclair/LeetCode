package tlecla.leetcode.problems;

import java.util.Arrays;

/**
 * 704. Binary Search
 * <p>
 * <a href="https://leetcode.com/problems/binary-search/description/">LeetCode link</a>
 */
public class BinarySearch {
  public int search(int[] nums, int target) {
    int index = Arrays.binarySearch(nums, target);
    return index < 0 ? -1 : index;
  }

  public int search1(int[] nums, int target) {
    return search1(nums, target, 0, nums.length - 1);
  }

  private int search1(int[] nums, int target, int left, int right) {
    if (left > right) {
      return -1;
    }
    int mid = (left + right) / 2;
    int middleNum = nums[mid];
    if (target == middleNum) {
      return mid;
    }
    if (target < middleNum) {
      return search1(nums, target, left, mid - 1);
    }
    else {
      return search1(nums, target, mid + 1, right);
    }
  }
}
