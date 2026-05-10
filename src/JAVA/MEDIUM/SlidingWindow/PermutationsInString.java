package JAVA.MEDIUM.SlidingWindow;

public class PermutationsInString {
    //https://leetcode.com/problems/permutation-in-string
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length()>s2.length()) return false;
            int[] freq1=new int[26];
            int[] freq2=new int[26];

            for(char ch: s1.toCharArray()){
                freq1[ch-'a']++;
            }
            int matches=0;
            for(int i=0;i<s1.length();i++){
                freq2[s2.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                if(freq1[i]==freq2[i]) matches++;
            }

            int left=0;

            for(int right=s1.length();right<s2.length();right++){
                if(matches==26) return true;
                int index=s2.charAt(right)-'a';
                freq2[index]++;

                if (freq2[index]==freq1[index]) matches++;
                else if (freq2[index]==freq1[index]+1) matches--;
                int leftIndex=s2.charAt(left)-'a';
                freq2[leftIndex]--;

                if (freq2[leftIndex]==freq1[leftIndex]) matches++;
                else if (freq2[leftIndex]==freq1[leftIndex]-1) matches--;
                left++;
            }
            return matches==26;

        }
    }
}
