package tlecla.leetcode.problems;

/**
 * 206. Reverse Linked List
 * <p>
 * <a href="https://leetcode.com/problems/reverse-linked-list/">LeetCode link</a>
 */
public class ReverseList {
  public ListNode reverseList(ListNode head) {
    ListNode next = head.next;
    head.next = null;
    while (next != null) {
      ListNode third = next.next;
      next.next = head;
      head = next;
      next = third;
    }
    return head;
  }
}
