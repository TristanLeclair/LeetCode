package tlecla.leetcode.problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * 102. Binary Tree Level Order Traversal
 * <p>
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/?envType=study-plan&id=level-1">LeetCode link</a>
 */
public class BinaryTreeLevelOrderTraversal {
  /*
  Idea: BFS traversal and accumulate all node for level
   */
  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) return new LinkedList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    List<List<Integer>> results = new LinkedList<>();
    while (!queue.isEmpty()) {
      List<Integer> levelResults = new LinkedList<>();
      int size = queue.size();
      for (int i = 0; i < size; ++i) {
        TreeNode current = queue.poll();
        levelResults.add(current.val);
        if (current.left != null) {
          queue.add(current.left);
        }
        if (current.right != null) {
          queue.add(current.right);
        }
      }
      results.add(levelResults);
    }
    return results;
  }

  public List<List<Integer>> levelOrder1(TreeNode root) {
    if (root == null) return new LinkedList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    List<List<Integer>> results = new LinkedList<>();
    while (!queue.isEmpty()) {
      List<Integer> levelResults = new LinkedList<>();
      Queue<TreeNode> prevNodes = new LinkedList<>();
      queue.forEach(treeNode -> {
        levelResults.add(treeNode.val);
        prevNodes.add(treeNode);
      });
      queue.clear();
      results.add(levelResults);
      prevNodes.forEach(treeNode -> {
        if (treeNode.left != null) {
          queue.add(treeNode.left);
        }
        if (treeNode.right != null) {
          queue.add(treeNode.right);
        }
      });
    }
    return results;
  }
}
