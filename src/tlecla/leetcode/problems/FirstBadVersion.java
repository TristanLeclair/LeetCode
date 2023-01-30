package tlecla.leetcode.problems;

/**
 * 278. First Bad Version
 * <p>
 * <a href="https://leetcode.com/problems/first-bad-version/">LeetCode link</a>
 */
public class FirstBadVersion {
  public int firstBadVersion(int versions) {
    int left = 1;
    int right = versions;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }

  //For testing. The LeetCode version of the method "calls an API"
  private boolean isBadVersion(int n) {
    return n > 1702766719;
  }
}
