package tlecla.leetcode.problems;

import java.util.HashSet;

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
