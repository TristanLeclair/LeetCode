package tlecla.leetcode.problems;

public class MajorityElement {
  public static int majorityElement(int[] nums) {
    int majority = nums[0];
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == majority) {
        count++;
      } else {
        count--;
        if (count == 0) {
          majority = nums[i];
          count = 1;
        }
      }
    }
    return majority;
  }

  public static void main(String[] args) {
    System.out.println(majorityElement(new int[]{3, 2, 3}));
  }
}
