package JAVA.EASY;

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
}
