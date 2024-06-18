package tlecla.leetcode.problems;

/**
 * Palindrome
 */
public class Palindrome {
  public static boolean isPalindrome(String s) {
    return s.contentEquals(new StringBuilder(s).reverse());
  }
}
