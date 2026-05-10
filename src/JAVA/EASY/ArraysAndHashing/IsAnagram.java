package JAVA.EASY.ArraysAndHashing;

import java.util.Arrays;

public class IsAnagram {
    /* https://leetcode.com/problems/valid-anagram
     */
    public boolean isAnagram(String s, String t) {
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

    /*  optimized=------------------
    public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;

    int[] count = new int[26];

    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }

    for (int num : count) {
        if (num != 0) return false;
    }

    return true;
}
     */
}
