package tlecla.leetcode.problems;

/**
 * 98. Validate Binary Search Tree
 * <p>
 * <a href="https://leetcode.com/problems/validate-binary-search-tree/">LeetCode link</a>
 */
public class ValidateBinaryTree {
  public boolean classierSolution(TreeNode root) {
    return classierSolution(root, null, null);
  }

  /*
  Integer lets us check for null instead of having Integer.MIN_VALUE as our min (same for max)
   */
  public boolean classierSolution(TreeNode current, Integer min, Integer max) {
    if (current == null) return true;
    if ((min != null && current.val <= min) || (max != null && current.val >= max)) {
      return false;
    }
    return classierSolution(current.right, current.val, max) && classierSolution(current.left, min, current.val);
  }

  public boolean isValidBST(TreeNode root) {
    if (root == null) return true;
    if (root.left != null) {
      if (root.left.val >= root.val) {
        return false;
      }
      if (!isValidBST(root.left, (long) Integer.MIN_VALUE - 1, root.val)) {
        return false;
      }
    }
    if (root.right != null) {
      if (root.right.val <= root.val) {
        return false;
      }
      return isValidBST(root.right, root.val, (long) Integer.MAX_VALUE + 1);
    }
    return true;
  }

  private boolean isValidBST(TreeNode current, long minValue, long maxValue) {
    TreeNode left = current.left;
    TreeNode right = current.right;
    if (left != null) {
      if (left.val <= minValue || left.val >= current.val) {
        return false;
      }
      if (!isValidBST(left, minValue, Math.min(maxValue, current.val))) {
        return false;
      }
    }
    if (right != null) {
      if (right.val >= maxValue || right.val <= current.val) {
        return false;
      }
      return isValidBST(right, Math.min(minValue, current.val), maxValue);
    }
    return true;
  }
}
