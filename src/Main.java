import tlecla.leetcode.problems.MergeTwoSortedLists;
import tlecla.leetcode.problems.NAryTreePreorderTraversal;
import tlecla.leetcode.problems.Node;

public class Main {
  public static void main(String[] args) {
    NAryTreePreorderTraversal pre = new NAryTreePreorderTraversal();
    Node node = new Node(3);
    System.out.println(pre.preorder(node));
  }
}