package tlecla.leetcode.problems;

/**
 * 1480. Running Sum of 1d Array
 * <p>
 * <a href="https://leetcode.com/problems/running-sum-of-1d-array/">LeetCode link</a>
 */
public class RunningSum {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
