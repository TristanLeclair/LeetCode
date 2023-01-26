package tlecla.leetcode.problems;

import java.util.HashSet;

/**
 * 217. Contains Duplicate
 * <p>
 * <a href="https://leetcode.com/problems/contains-duplicate/">LeetCode link</a>
 */
public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> occurs = new HashSet<>();
    for(int x: nums) {
      if(!occurs.add(x)) {
        return true;
      }
    }
    return false;
  }
}
