package tlecla.leetcode.problems;

/**
 * 392. Is Subsequence
 * <p>
 * <a href="https://leetcode.com/problems/is-subsequence/">LeetCode link</a>
 */
public class IsSubsequence {
  public static boolean isSubsequence(String s, String t) {
    if (s.length() > t.length()) return false;
    if (s.isEmpty()) return true;

    char[] charArray = s.toCharArray();
    int subLength = s.length();
    int subIdx = 0;
    for (char c : t.toCharArray()) {
      if (charArray[subIdx] == c) {
        subIdx++;
      }
      if (subIdx == subLength) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {

  }

  public boolean isSubsequenceOld(String s, String t) {
    if (s.length() > t.length()) {
      return false;
    }
    if (s.isEmpty()) {
      return true;
    }
    char[] toCheckArray = s.toCharArray();
    int toCheckIndex = 0;
    for (int i = 0; i < t.length(); i++) {
      if (toCheckArray[toCheckIndex] == t.charAt(i)) {
        toCheckIndex++;
        if (toCheckIndex == toCheckArray.length) {
          return true;
        }
      }
    }
    return false;
  }
}
