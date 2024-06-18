package tlecla.leetcode.problems;

public class StringCompression {
  public static int compress(char[] chars) {
    int len = chars.length;
    if (len == 0) return 0;
    if (len == 1) return 1;

    int write = 0;
    int read = 0;

    // Iterate over string
    while (read < len) {
      char curr = chars[read];
      int count = 0;

      // count amount of consecutive characters
      while (read < len && chars[read] == curr) {
        read++;
        count++;
      }

      // write the current character we were reading to the next spot in the array
      chars[write] = curr;
      // then increment (clearer than if we leave the incrementation inside the assignment)
      write++;

      if (count > 1) {
        // need for loop in case count > 9, in which case we need > 1 characters
        for (char c : Integer.toString(count).toCharArray()) {
          chars[write] = c;
          write++;
        }
      }
    }
    return write;
  }

  public static void main(String[] args) {
    System.out.println(StringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    System.out.println(StringCompression.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
  }
}
