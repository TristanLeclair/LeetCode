package tlecla.leetcode.problems;


/**
 * 235. Lowest Common Ancestor of a Binary Search Tree
 * <p>
 * <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">LeetCode link</a>
 */
public class LowestCommonAncestorOfBinTree {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) return null;

    if (p.val > root.val && q.val > root.val) {
      return lowestCommonAncestor(root.right, p, q);
    } else if (p.val < root.val && q.val < root.val) {
      return lowestCommonAncestor(root.left, p, q);
    }
    return root;
  }

  public TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode p, TreeNode q) {
    TreeNode current = root;

    while (current != null) {
      if (p.val > current.val && q.val > current.val) {
        current = current.right;
      } else if (p.val < current.val && q.val < current.val) {
        current = current.left;
      }
      // They either split on either side of current or current is equal to one of them
      else {
        return current;
      }
    }
    return null;
  }
}
