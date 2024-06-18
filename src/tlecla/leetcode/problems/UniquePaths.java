package tlecla.leetcode.problems;

/**
 * 62. Unique Paths
 * <p>
 * <a href="https://leetcode.com/problems/unique-paths/">LeetCode link</a>
 */
public class UniquePaths {
  private int[][] paths;

  public int uniquePaths(int m, int n) {
    paths = new int[m][n];
    return uniquePathsRecurse(m, n);
  }

  private int uniquePathsRecurse(int m, int n) {
    int mIndex = m - 1, nIndex = n - 1;
    if (paths[mIndex][nIndex] != 0) {
      return paths[mIndex][nIndex];
    }
    if (m == 1 || n == 1) {
      paths[mIndex][nIndex] = 1;
      return 1;
    }
    if (paths[mIndex - 1][nIndex] == 0) {
      uniquePathsRecurse(m - 1, n);
    }
    if (paths[mIndex][nIndex - 1] == 0) {
      uniquePathsRecurse(m, n - 1);
    }
    paths[mIndex][nIndex] = paths[mIndex - 1][nIndex] + paths[mIndex][nIndex - 1];
    return paths[mIndex][nIndex];
  }
}
