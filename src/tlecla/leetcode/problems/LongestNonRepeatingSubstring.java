package tlecla.leetcode.problems;

import java.util.HashMap;

/**
 * 3. Longest Substring Without Repeating Characters
 * <p>
 * <a href="https://leetcode.com/problems/longest-repeating-character-replacement/">LeetCode link</a>
 */
public class LongestNonRepeatingSubstring {
  public int lengthOfLongestSubstring(String s) {
    int sLen = s.length();
    if (sLen == 0) return 0;
    HashMap<Character, Integer> sMap = new HashMap<>();
    int maxLen = 0;
    int left = 0;
    for (int i = 0; i < sLen; i++) {
      char curr = s.charAt(i);
      Integer index = sMap.get(curr);
      if (index == null) {
        sMap.put(curr, i);
      }
      // letter is in map
      else {
        left = Math.max(index + 1, left);
        sMap.put(curr, i);
      }
      maxLen = Math.max(i + 1 - left, maxLen);
    }
    return maxLen;
  }
}
