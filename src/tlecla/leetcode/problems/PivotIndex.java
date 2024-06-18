package tlecla.leetcode.problems;

/**
 * 724. Find Pivot Index
 * <p>
 * <a href="https://leetcode.com/problems/find-pivot-index/">LeetCode link</a>
 */
public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int sum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }

    // Doesn't find leftmost
    public int incorrectPivotIndex(int[] nums) {
        return incorrectPivotIndex(nums, 0, nums.length - 1, nums[0], nums[nums.length - 1]);
    }

    private int incorrectPivotIndex(int[] nums, int left, int right, int leftResult, int rightResult) {
        if(left >= right) {
            return -1;
        }
        if (leftResult == rightResult && right - left == 2) {
            return left + 1;
        }
        if (leftResult > rightResult) {
            return incorrectPivotIndex(nums, left, right - 1, leftResult, rightResult + nums[right - 1]);
        }
        return incorrectPivotIndex(nums, left + 1, right, leftResult + nums[left + 1], rightResult);
    }
}
