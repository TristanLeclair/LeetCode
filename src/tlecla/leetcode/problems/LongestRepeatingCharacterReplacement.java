package tlecla.leetcode.problems;

import java.util.Arrays;

/**
 * 424. Longest Repeating Character Replacement
 * <p>
 * <a href="https://leetcode.com/problems/longest-repeating-character-replacement/">LeetCode link</a>
 */
public class LongestRepeatingCharacterReplacement {
  public int characterReplacement(String s, int k) {
    int left = 0;
    int maxWindowSize = 0;
    int[] letterOccurrences = new int[26];
    int maxOccurrence = 0;
    for (int right = 0; right < s.length(); right++) {
      int currentIndex = s.charAt(right) - 'A';
      int newOccurrences = ++letterOccurrences[currentIndex];
      if (newOccurrences > maxOccurrence) {
        maxOccurrence = newOccurrences;
      }
      int currentWindowSize = right + 1 - left;
      if (currentWindowSize - maxOccurrence <= k) {
        maxWindowSize = currentWindowSize;
      } else {
        --letterOccurrences[s.charAt(left) - 'A'];
        left++;
      }
    }

    return maxWindowSize;
  }

  /*
    Don't need to find max every time because we only care when its maximized, so we just keep tally of max and then update max if it surpasses it
   */
  private boolean isValidWindow(int[] letterOccurrences, int windowLen, int k) {
    return windowLen - Arrays.stream(letterOccurrences).max().getAsInt() <= k;
  }
}
