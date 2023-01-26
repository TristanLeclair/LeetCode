package tlecla.leetcode.problems;

public class IsSubsequence {
  public boolean isSubsequence(String s, String t) {
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
