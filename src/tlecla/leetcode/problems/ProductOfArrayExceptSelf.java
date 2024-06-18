package tlecla.leetcode.problems;

/**
 * 238. Product of Array Except Self
 * <p>
 * <a href="https://leetcode.com/problems/product-of-array-except-self/">LeetCode link</a>
 */
public class ProductOfArrayExceptSelf {
  /*
  Calculate prefix and store in output array
  Then pass back and calculate postfix
   */
  public int[] productExceptSelf(int[] nums) {
    int prefix = 1;
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[i] = prefix;
      prefix *= nums[i];
    }

    int post = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      result[i] *= post;
      post *= nums[i];
    }
    return result;
  }
}
