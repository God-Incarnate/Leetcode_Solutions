package JAVA.MEDIUM.SlidingWindow;

import java.util.HashSet;

public class LongestSubstringUniqueCharacter {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> ptr=new HashSet<>();
            int left=0;
            int max=0;
            for(int right=0;right<s.length();right++){
                char c=s.charAt(right);
                while(ptr.contains(c)){
                    ptr.remove(s.charAt(left));
                    left++;
                }
                ptr.add(c);
                max=Math.max(max,right-left+1);
            }
            return max;
        }
    }
}
