package tlecla.leetcode.problems;

import java.util.Stack;

/**
 * 394. Decode String
 * <p>
 * <a href="https://leetcode.com/problems/decode-string/">LeetCode link</a>
 */
public class DecodeString {
  public String decodeString(String s) {
    Stack<Character> stack = new Stack<>();
    stack.push(s.charAt(0));
    while (!stack.isEmpty()) {
      char curr = stack.pop();
    }
    //TODO: finish
    return "boo";
  }
}
