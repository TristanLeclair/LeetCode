package tlecla.leetcode.problems;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 589. N-Ary Tree Preorder Traversal
 * <p>
 * <a href="https://leetcode.com/problems/n-ary-tree-preorder-traversal/">LeetCode link</a>
 */
public class NAryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        List<Integer> values = new LinkedList<>();
        Node current = stackPoll(stack);
        while (current != null) {
            values.add(current.val);
            if (current.children == null) {
                current = stackPoll(stack);
                continue;
            }
            for (Node child : current.children) {
                if (child != null) {
                    stack.add(child);
                }
            }
            current = stackPoll(stack);
        }
        return values;
    }

    private Node stackPoll(Stack<Node> stack) {
        try {
            return stack.pop();
        } catch (EmptyStackException e) {
            return null;
        }
    }
}
