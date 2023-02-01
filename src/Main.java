import tlecla.leetcode.problems.NumberOfIslands;

public class Main {
  public static void main(String[] args) {
    NumberOfIslands num = new NumberOfIslands();
    num.numIslands(new char[][]{
            {'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}
    });
  }
}