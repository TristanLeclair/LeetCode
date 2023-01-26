package tlecla.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public boolean isIsomorphicMine(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> seenMapT = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            Character indexChar = map.get(sChar);
            if ((map.containsKey(sChar) || seenMapT.contains(tChar)) && (indexChar == null || indexChar != tChar)) {
                return false;
            }
            map.put(sChar, tChar);
            seenMapT.add(tChar);
        }
        return true;
    }

    // Same time complexity
    public boolean isIsomorphicAnswer(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sTotMap = new int[256];
        int[] tTosMap = new int[256];
        Arrays.fill(sTotMap, -1);
        Arrays.fill(tTosMap, -1);

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sTotMap[sChar] == -1 && tTosMap[tChar] == -1) {
                sTotMap[sChar] = tChar;
                tTosMap[tChar] = sChar;
            } else if (!(sTotMap[sChar] == tChar && tTosMap[tChar] == sChar)) {
                return false;
            }
        }
        return true;
    }
}
