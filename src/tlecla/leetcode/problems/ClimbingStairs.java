package tlecla.leetcode.problems;

/**
 * 70. Climbing Stairs
 * <p>
 * <a href="https://leetcode.com/problems/climbing-stairs/">LeetCode link</a>
 */
public class ClimbingStairs {

  public int climbStairs(int n) {
    if (n < 3) return n;
    int oneStep = 1;
    int twoStep = 1;
    for (int i = 0; i < n - 1; i++) {
      int tempOne = oneStep;
      oneStep = oneStep + twoStep;
      twoStep = tempOne;
    }
    return oneStep;
  }
}
