package tlecla.leetcode.problems;

public class MaxVowels {
  public static int maxVowels(String s, int k) {
    // isVowel[character] will return 1 if the character is a vowel
    // which we can use to increment and decrement the count
    byte[] isVowel = new byte['z' + 1];
    isVowel['a'] = isVowel['e'] = isVowel['i'] = isVowel['o'] = isVowel['u'] = 1;
    int len = s.length();
    char[] word = s.toCharArray();
    int count = 0;
    for (int i = 0; i < k; ++i) {
      count += isVowel[word[i]];
    }
    int maxCount = count;

    for (int i = k; i < len; ++i) {
      count += isVowel[word[i]] - isVowel[word[i - k]];
      maxCount = Math.max(maxCount, count);
    }
    return maxCount;
  }

  public static void main(String[] args) {
    System.out.println(MaxVowels.maxVowels("abciiidef", 3));
    System.out.println(MaxVowels.maxVowels("aeiou", 2));
    System.out.println(MaxVowels.maxVowels("leetcode", 3));
  }
}
