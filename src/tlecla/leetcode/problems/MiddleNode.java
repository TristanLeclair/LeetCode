package tlecla.leetcode.problems;

/**
 * 876. Middle of the Linked List
 * <p>
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/">LeetCode link</a>
 */
public class MiddleNode {
  public ListNode middleNode(ListNode head) {
    if(head == null) return null;
    ListNode middle = head;
    boolean skip = false;
    while(head.next != null) {
      if (!skip) {
        middle = middle.next;
      }
      head = head.next;
      skip = !skip;
    }
    return middle;
  }
}
