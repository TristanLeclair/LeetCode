package tlecla.leetcode.problems;

/**
 * 509. Fibonacci Number
 * <p>
 * <a href="https://leetcode.com/problems/fibonacci-number/">LeetCode link</a>
 */
public class FibonacciNumber {
  private int[] fibRes;

  public int fib(int n) {
    if (n == 0 || n == 1) return n;
    fibRes = new int[n];
    fibRes[0] = 0;
    fibRes[1] = 1;
    return fibRecurse(n);
  }

  private int fibRecurse(int n) {
    int index = n - 1;
    if (n == 0) return 0;
    if (n == 1) return 1;
    if (fibRes[index] != 0) {
      return fibRes[index];
    }
    fibRes[index] = fibRecurse(n - 1) + fibRecurse(n - 2);
    return fibRes[index];
  }
}
