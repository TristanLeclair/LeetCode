import tlecla.leetcode.problems.*;

public class Main {
  public static void main(String[] args) {
    BinaryTreeLevelOrderTraversal bin = new BinaryTreeLevelOrderTraversal();
    TreeNode tree = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    System.out.println(bin.levelOrder(tree));
  }
}