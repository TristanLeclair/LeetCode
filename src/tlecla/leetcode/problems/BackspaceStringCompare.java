package tlecla.leetcode.problems;

import java.util.Stack;

/**
 * 844. Backspace String Compare
 * <p>
 * <a href="https://leetcode.com/problems/backspace-string-compare/">LeetCode link</a>
 */
public class BackspaceStringCompare {
  public boolean backspaceCompare(String s, String t) {
    Stack<Character> sStack = new Stack<>();
    Stack<Character> tStack = new Stack<>();

    fillStack(sStack, s);
    fillStack(tStack, t);
    if (sStack.size() != tStack.size()) return false;
    while (!sStack.isEmpty() && !tStack.isEmpty()) {
      char sChar = sStack.pop();
      char tChar = tStack.pop();
      if (sChar != tChar) {
        return false;
      }
    }
    return true;
  }

  private void fillStack(Stack<Character> stack, String s) {
    for (int i = 0; i < s.length(); i++) {
      char curr = s.charAt(i);
      if (curr == '#') {
        if (!stack.isEmpty()) stack.pop();
      } else {
        stack.push(curr);
      }
    }
  }
}
