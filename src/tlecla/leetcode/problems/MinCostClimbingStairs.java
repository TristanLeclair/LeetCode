package tlecla.leetcode.problems;

/**
 * 746. Min Cost Climbing Stairs
 * <p>
 * <a href="https://leetcode.com/problems/min-cost-climbing-stairs/">LeetCode link</a>
 */
public class MinCostClimbingStairs {
  private int[] minCostSoFar;
  private int[] cost;

  // Space O(n)
  public int minCostClimbingStairs(int[] cost) {
    this.cost = cost;
    minCostSoFar = new int[cost.length + 1];
    for (int i = 2; i < minCostSoFar.length; i++) {
      climb(i);
    }
    return minCostSoFar[minCostSoFar.length - 1];
  }

  private void climb(int current) {
    minCostSoFar[current] = Math.min(minCostSoFar[current - 2] + cost[current - 2], minCostSoFar[current - 1] + cost[current - 1]);
  }

  // O(1) space
  public int minCostClimbingStairs2(int[] cost) {
    for (int i = 2; i < cost.length; i++) {
      cost[i] += Math.min(cost[i - 1], cost[i - 2]);
    }
    return Math.min(cost[cost.length - 2], cost[cost.length - 1]);
  }
}
