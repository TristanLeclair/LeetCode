package tlecla.leetcode.problems;

/**
 * 733. Flood Fill
 * <p>
 * <a href="https://leetcode.com/problems/flood-fill/">LeetCode link</a>
 */
public class FloodFill {
  private boolean[][] visited;
  private int color;
  private int initColor;

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    visited = new boolean[image.length][image[0].length];
    this.color = color;
    this.initColor = image[sr][sc];
    floodFillRecursive(image, sr, sc);
    return image;
  }

  private void floodFillRecursive(int[][] image, int sr, int sc) {
    if (isValid(image, sr, sc)) {
      visited[sr][sc] = true;
      image[sr][sc] = color;
      visitNeighbours(image, sr, sc);
    }
  }

  private void visitNeighbours(int[][] image, int sr, int sc) {
    floodFillRecursive(image, sr - 1, sc);
    floodFillRecursive(image, sr + 1, sc);
    floodFillRecursive(image, sr, sc + 1);
    floodFillRecursive(image, sr, sc - 1);
  }

  private boolean isValid(int[][] image, int sr, int sc) {
    return !(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || visited[sr][sc] || image[sr][sc] != initColor);
  }
}
