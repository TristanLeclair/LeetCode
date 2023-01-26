package tlecla.leetcode.problems;

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
