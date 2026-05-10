package JAVA.MEDIUM.ArraysAndHashing;

import java.util.HashSet;

public class LongestCosecutiveSubsequence {
    //https://leetcode.com/problems/longest-consecutive-sequence
    class Solution {
        public int longestConsecutive(int[] nums) {
            if(nums.length==0) return 0;
            if(nums.length==1) return 1;
            HashSet<Integer> numsVal=new HashSet<>();
            for(int num:nums){
                numsVal.add(num);
            }
            int maxC=0;
            for(int num:numsVal){
                if(!numsVal.contains(num-1)){
                    int countC=0;
                    while(numsVal.contains(num+1)){
                        countC++;
                        num++;
                    }
                    maxC=Math.max(maxC,countC);
                }

            }
            return maxC+1;
        }
    }
}
