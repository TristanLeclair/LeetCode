package tlecla.leetcode.problems;

/**
 * 299. Bulls and Cows
 * <p>
 * <a href="https://leetcode.com/problems/bulls-and-cows/">LeetCode link</a>
 */
public class BullsAndCows {
  public String getHint(String secret, String guess) {
    int len = secret.length();
    int bulls = 0;
    int cows = 0;
    int[] sMap = new int[10];
    int[] gMap = new int[10];
    for (int i = 0; i < len; i++) {
      int sIndex = secret.charAt(i) - '0';
      int gIndex = guess.charAt(i) - '0';
      if (sIndex == gIndex) {
        bulls++;
      } else {
        if (sMap[gIndex] != 0) {
          sMap[gIndex]--;
          cows++;
        } else {
          gMap[gIndex]++;
        }
        if (gMap[sIndex] != 0) {
          gMap[sIndex]--;
          cows++;
        } else {
          sMap[sIndex]++;
        }
      }
    }
    return String.format("%dA%dB", bulls, cows);
  }
}
