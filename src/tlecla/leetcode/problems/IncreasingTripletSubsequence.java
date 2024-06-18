package tlecla.leetcode.problems;

public class IncreasingTripletSubsequence {
  public static boolean increasingTriplet(int[] nums) {
    if (nums.length < 3) return false;
    int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
    for (int i : nums) {
      if (i <= first) {
        first = i;
      } else if (i <= second) {
        second = i;
      } else {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(IncreasingTripletSubsequence.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
    System.out.println(IncreasingTripletSubsequence.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    System.out.println(IncreasingTripletSubsequence.increasingTriplet(new int[]{2, 1, 5, 0, 6}));
  }
}
