package tlecla.leetcode.problems;

public class ReverseVowels {
  public static String reverseVowels(String s) {
//    StringBuilder sb = new StringBuilder(s);

    // Arrays are much faster for small words
    char[] word = s.toCharArray();
    int l = 0, r = s.length() - 1;
    String vowels = "aeiouAEIOU";
    while (l < r) {
//      while (l < r && vowels.indexOf(sb.charAt(r)) == -1) {
      while (l < r && vowels.indexOf(word[r]) == -1) {
        --r;
      }
//      while (l < r && vowels.indexOf(sb.charAt(l)) == -1) {
      while (l < r && vowels.indexOf(word[l]) == -1) {
        ++l;
      }
      char rightChar = word[r];
      word[r] = word[l];
      word[l] = rightChar;
/*
      sb.setCharAt(r, sb.charAt(l));
      sb.setCharAt(l, rightChar);
*/

      ++l;
      --r;
    }
//    return sb.toString();
    return new String(word);
  }
}
