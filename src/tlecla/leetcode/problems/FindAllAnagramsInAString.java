package tlecla.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 438. Find All Anagrams in a String
 * <p>
 * <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/">LeetCode link</a>
 */
public class FindAllAnagramsInAString {

  /*
   Time complexity: O(n)
   Space complexity: O(1) (two arrays of length 26, only english letters as possible indexes)
   */
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> results = new LinkedList<>();
    int sLength = s.length();
    int pLength = p.length();
    if (pLength > sLength) {
      return results;
    }
    int[] pMap = new int[26];
    int[] sMap = new int[26];
    for (int i = 0; i < pLength; i++) {
      int pIndex = p.charAt(i) - 'a';
      pMap[pIndex]++;
      int sIndex = s.charAt(i) - 'a';
      sMap[sIndex]++;
    }
    if (Arrays.equals(pMap, sMap)) {
      results.add(0);
    }
    int leftIndex = 0;
    for (int i = pLength; i < sLength; i++) {
      int toRemove = s.charAt(leftIndex) - 'a';
      sMap[toRemove]--;
      leftIndex++;

      int toAdd = s.charAt(i) - 'a';
      sMap[toAdd]++;

      if (Arrays.equals(pMap, sMap)) {
        results.add(leftIndex);
      }
    }

    return results;
  }

  // Map solution
  public List<Integer> findAnagrams1(String s, String p) {
    List<Integer> results = new LinkedList<>();
    if (p.length() > s.length()) {
      return results;
    }
    HashMap<Character, Integer> pMap = new HashMap<>();
    HashMap<Character, Integer> sMap = new HashMap<>();
    for (int i = 0; i < p.length(); i++) {
      char pChar = p.charAt(i);
      Integer pCount = pMap.getOrDefault(p.charAt(i), 0);
      pMap.put(pChar, ++pCount);
      char sChar = s.charAt(i);
      Integer sCount = sMap.getOrDefault(s.charAt(i), 0);
      sMap.put(sChar, ++sCount);
    }
    if (pMap.equals(sMap)) {
      results.add(0);
    }
    int leftIndex = 0;
    for (int i = p.length(); i < s.length(); i++) {
      char toRemove = s.charAt(leftIndex);
      int count = sMap.get(toRemove);
      if (count == 1) {
        sMap.remove(toRemove);
      } else {
        sMap.merge(toRemove, -1, Integer::sum);
      }
      leftIndex++;

      char toAdd = s.charAt(i);
      sMap.merge(toAdd, 1, Integer::sum);

      if (pMap.equals(sMap)) {
        results.add(leftIndex);
      }
    }
    return results;
  }

}
