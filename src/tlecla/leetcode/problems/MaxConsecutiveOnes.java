package tlecla.leetcode.problems;

public class MaxConsecutiveOnes {
  public static int longestOnes(int[] nums, int k) {
    int currentZeroes = 0;
    int left = 0, right = 0;

    int maxOnes = 0;
    int currentOnes = 0;
    while (right < nums.length) {
      int nextNum = nums[right];
      if (nextNum == 0) {
        ++currentZeroes;
        if (currentZeroes > k) {
          while (nums[left] == 1) {
            --currentOnes;
            ++left;
          }
          ++left;
          --currentZeroes;
        }
      } else {
        ++currentOnes;
      }
      maxOnes = Math.max(maxOnes, currentOnes + currentZeroes);
      ++right;
    }
    return maxOnes;
  }

  public static int longestOnes2(int[] nums, int k) {
    int i = 0, j;
    for (j = 0; j < nums.length; j++) {
      if (nums[j] == 0) k--;
      if (k < 0 && nums[i++] == 0) k++;
    }
    return j - i;
  }

  public static void main(String[] args) {
    System.out.println(MaxConsecutiveOnes.longestOnes2(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    System.out.println(MaxConsecutiveOnes.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
  }
}
