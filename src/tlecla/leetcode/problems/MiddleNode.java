package tlecla.leetcode.problems;

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
