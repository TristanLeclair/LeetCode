package tlecla.leetcode.problems;

/**
 * 2. Add two numbers
 * <p>
 * <a href="https://leetcode.com/problems/add-two-numbers/">LeetCode link</a>
 */
public class AddTwoNumbers {
  /**
   * Adds numbers in list one with numbers in list two
   *
   * @param l1 first list to add
   * @param l2 second list to add
   * @pre all node values are 0 <= val <= 9
   * @return list representing sum of numbers in both lists
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carryOver = 0;
    ListNode resultHead = new ListNode();
    ListNode resultList = resultHead;
    ListNode prev = resultHead;
    while(l1 != null && l2 != null) {
      int sum = l1.val + l2.val + carryOver;
      if (sum >= 10) {
        carryOver = 1;
        sum -= 10;
      } else {
        carryOver = 0;
      }
      resultList.val = sum;
      resultList.next = new ListNode();
      prev = resultList;
      resultList = resultList.next;
      l1 = l1.next;
      l2 = l2.next;
    }
    while(l1 != null) {
      int sum = l1.val + carryOver;
      if (sum >= 10) {
        carryOver = 1;
        sum -= 10;
      } else {
        carryOver = 0;
      }
      resultList.val = sum;
      resultList.next = new ListNode();
      prev = resultList;
      resultList = resultList.next;
      l1 = l1.next;
    }
    while(l2 != null) {
      int sum = l2.val + carryOver;
      if (sum >= 10) {
        carryOver = 1;
        sum -= 10;
      } else {
        carryOver = 0;
      }
      resultList.val = sum;
      resultList.next = new ListNode();
      prev = resultList;
      resultList = resultList.next;
      l2 = l2.next;
    }
    if(carryOver == 1) {
      resultList.val = carryOver;
    } else {
      prev.next = null;
    }
    return resultHead;
  }
}
