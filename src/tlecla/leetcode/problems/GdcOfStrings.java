package tlecla.leetcode.problems;

public class GdcOfStrings {
  public String gcdOfStrings(String str1, String str2) {
    if (!(str1 + str2).equals(str2 + str1)) {
      return "";
    }
    int gcd = gcd(str1.length(), str2.length());
    return str1.substring(0, gcd);
  }

  private int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }

  public String gcdOfStringsSol(String str1, String str2) {
    if (str1.length() < str2.length()) {
      return gcdOfStringsSol(str2, str1);
    }
    if (str2.equals(str1)) {
      return str1;
    }
    if (str1.startsWith(str2)) {
      return gcdOfStringsSol(str1.substring(str2.length()), str2);
    }

    return "";
  }
}
