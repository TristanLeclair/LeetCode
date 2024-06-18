package tlecla.leetcode.problems;

public class ReverseWord {
  public static String reverseWord(String s) {
    StringBuilder sb = new StringBuilder();
    int wordStart = 0;
    int len = s.length();
    while (wordStart < len) {
      while (wordStart < len && s.charAt(wordStart) == ' ') {
        ++wordStart;
      }
      if (wordStart >= len) break;
      int wordEnd = wordStart;
      while (wordEnd < len && s.charAt(wordEnd) != ' ') {
        ++wordEnd;
      }
      String word = s.substring(wordStart, wordEnd);
      if (sb.isEmpty()) sb.append(word);
      else sb.insert(0, ' ').insert(0, word);
      wordStart = wordEnd + 1;
    }

    return sb.toString();
  }
}
