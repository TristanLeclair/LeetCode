package tlecla.leetcode.problems;

/**
 * 409. Longest Palindrome
 * <p>
 * <a href="https://leetcode.com/problems/longest-palindrome/">LeetCode link</a>
 */
public class LongestPalindrome {
  public int longestPalindrome(String s) {
    int[] counts = new int[128];
    for(char c: s.toCharArray()) {
      counts[c]++;
    }
    boolean oddAdded = false;
    int totalLength = 0;
    for(int numOfOccurrences: counts) {
      if (numOfOccurrences%2 == 0) {
        totalLength += numOfOccurrences;
      } else {
        oddAdded = true;
        totalLength += numOfOccurrences - 1;
      }
    }
    if (oddAdded) {
      totalLength++;
    }
    return totalLength;
  }
}
