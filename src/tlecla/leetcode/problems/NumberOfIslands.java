package tlecla.leetcode.problems;

public class NumberOfIslands {
  private int m;
  private int n;
  private char[][] grid;

  public int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
    this.grid = grid;
    this.m = grid.length;
    this.n = grid[0].length;
    int numOfIslands = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '1') {
          visit(i, j);
          ++numOfIslands;
        }
      }
    }
    return numOfIslands;
  }

  private void visit(int row, int col) {
    if (isValid(row, col)) {
      grid[row][col] = '0';
      visitNeighbours(row, col);
    }
  }

  private void visitNeighbours(int row, int col) {
    visit(row - 1, col);
    visit(row + 1, col);
    visit(row, col - 1);
    visit(row, col + 1);
  }

  private boolean isValid(int row, int col) {
    return !(row < 0 || col < 0 || row >= m || col >= n || grid[row][col] == '0');
  }
}
