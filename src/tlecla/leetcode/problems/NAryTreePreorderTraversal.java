package tlecla.leetcode.problems;

import java.util.LinkedList;
import java.util.List;

/**
 * 589. N-Ary Tree Preorder Traversal
 * <p>
 * <a href="https://leetcode.com/problems/n-ary-tree-preorder-traversal/">LeetCode link</a>
 */
public class NAryTreePreorderTraversal {
  public List<Integer> preorder(Node root) {
    List<Integer> results = new LinkedList<>();
    traversePre(root, results);
    return results;
  }

  private void traversePre(Node root, List<Integer> total) {
    if (root != null) {
      total.add(root.val);
      root.children.forEach(child -> traversePre(child, total));
    }
  }

  public List<Integer> postOrder(Node root) {
    List<Integer> results = new LinkedList<>();
    traversePost(root, results);
    return results;
  }

  private void traversePost(Node root, List<Integer> total) {
    if (root != null) {
      root.children.forEach(child -> traversePre(child, total));
      total.add(root.val);
    }
  }
}
