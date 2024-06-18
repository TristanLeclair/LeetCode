package tlecla.leetcode.problems;

import java.util.HashSet;

/**
 * 142. Linked List Cycle II
 * <p>
 * <a href="https://leetcode.com/problems/linked-list-cycle-ii/">LeetCode link</a>
 */
public class DetectCycleII {
  /*
  Time: O(n)
  Space: O(1)

  Basically both pointers eventually enter the cycle. And they have an integer gap between them.
  f - s = x (all ints)
  the gap is augmented by 1 from s moving, but reduced by 2 from f moving.
  x + 1 - 2 = x - 1 (meaning gap will always reach 0 at some point)
  gap is at most n-1 (meaning O(n)) runtime

  Video explaining Floyd's Tortoise and Hare: https://youtu.be/gBTe7lFR3vc

  Link to leetcode solution: https://leetcode.com/problems/linked-list-cycle-ii/solutions/1701128/c-java-python-slow-and-fast-image-explanation-beginner-friendly/

  Basically when fast and slow meet, fast will have travelled a full length of the cycle more than slow.

  x is distance to cycle
  y is distance past cycle beginning that they meet at
  C is cycle length

  slow has moved x + y
  fast has moved x + y + C = 2(x + y)     (was moving twice as fast)
  x + y + C = 2(x + y)
  x + y + C = 2x + 2y
  C = x + y
  x = C - y
  Meaning if you're at position x + y, travelling C - y will land you at x, both from x or the beginning (where the head is)
   */
  public ListNode detectCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) break;
    }
    if (fast == null || fast.next == null) return null;
    while (head != slow) {
      head = head.next;
      slow = slow.next;
    }
    return head;
  }

  /*
  Time: O(n)
  Space: O(n)
   */
  public ListNode detectCycle1(ListNode head) {
    if (head == null) return null;
    HashSet<ListNode> visited = new HashSet<>();
    visited.add(head);
    while (head.next != null) {
      ListNode next = head.next;
      if (visited.contains(next)) {
        return next;
      }
      visited.add(next);
      head = next;
    }
    return null;
  }
}
