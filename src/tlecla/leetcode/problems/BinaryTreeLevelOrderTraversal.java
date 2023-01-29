package tlecla.leetcode.problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeLevelOrderTraversal {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> results = new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    int level = 0;
    int iteration = 0;
    while (!stack.isEmpty()) {
      TreeNode currentParent = stack.pop();
      if (currentParent.left != null) {
        stack.add(currentParent.left);
      }
      if (currentParent.right != null) {
        stack.add(currentParent.right);
      }

    }
    return results;
  }
}
