package tlecla.leetcode.problems;

public class CanPlaceFlowers {
  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    if (n == 0) return true;
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 0) {
        boolean leftIsEmpty = (i == 0) || (flowerbed[i - 1] == 0);
        boolean rightIsEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
        if (leftIsEmpty && rightIsEmpty) {
          flowerbed[i] = 1;
          n--;
          if (n == 0) return true;
          i++;
        }
      } else {
        i++;
      }
    }
    return false;
  }
}
