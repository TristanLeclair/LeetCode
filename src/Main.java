import tlecla.leetcode.problems.TreeNode;
import tlecla.leetcode.problems.ValidateBinaryTree;

public class Main {
  public static void main(String[] args) {
    ValidateBinaryTree val = new ValidateBinaryTree();
    TreeNode tree = new TreeNode(Integer.MAX_VALUE - 3, new TreeNode(Integer.MIN_VALUE), new TreeNode(Integer.MAX_VALUE - 1, new TreeNode(Integer.MAX_VALUE - 2), new TreeNode(Integer.MAX_VALUE)));
    System.out.println(val.isValidBST(tree));
  }
}