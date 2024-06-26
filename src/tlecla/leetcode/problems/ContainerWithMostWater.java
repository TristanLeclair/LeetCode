package tlecla.leetcode.problems;

public class ContainerWithMostWater {
  public static int maxArea(int[] height) {
    int left = 0, right = height.length - 1;
    int maxArea = 0;
    while (left < right) {
      int currArea = Math.min(height[left], height[right]) * (right - left);
      maxArea = Math.max(maxArea, currArea);

      if (height[left] < height[right]) {
        ++left;
      } else {
        --right;
      }
    }
    return maxArea;
  }

  public static void main(String[] args) {
    System.out.println(ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
  }
}
