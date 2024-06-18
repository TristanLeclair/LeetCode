package tlecla.leetcode.problems;

public class mergeAlternatively {
  public String mergeAlternately(String word1, String word2) {
    StringBuilder sb = new StringBuilder();
    int idx = 0;
    int l1 = word1.length(), l2 = word2.length();
    while (idx < l1 && idx < l2) {
      sb.append(word1.charAt(idx));
      sb.append(word2.charAt(idx));
      idx++;
    }
    if (idx < l1 || idx < l2) {
      sb.append(word1.substring(idx));
      sb.append(word2.substring(idx));
    }
    return sb.toString();
  }
}
