package tlecla.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Integer> map = new ArrayList<>();
    int maxCandy = Integer.MIN_VALUE;
    for (int i = 0; i < candies.length; i++) {
      int currCandy = candies[i];
      if (currCandy > maxCandy) {
        maxCandy = currCandy;
      }
      map.add(currCandy);
    }
    List<Boolean> result = new ArrayList<>();
    int finalMaxCandy = maxCandy;
    map.forEach((v) -> result.add(v + extraCandies >= finalMaxCandy));
    return result;
  }

  public List<Boolean> kidsWithCandiesSol(int[] candies, int extraCandies) {
    int maxCandy = Integer.MIN_VALUE;
    for (int i : candies) {
      maxCandy = Math.max(maxCandy, i);
    }
    List<Boolean> result = new ArrayList<>();
    for (int candy : candies) {
      result.add(candy + extraCandies >= maxCandy);
    }
    return result;
  }
}
