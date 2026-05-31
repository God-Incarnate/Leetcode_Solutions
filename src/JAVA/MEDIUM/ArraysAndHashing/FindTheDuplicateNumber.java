package JAVA.MEDIUM.ArraysAndHashing;

public class FindTheDuplicateNumber {
    //https://leetcode.com/problems/find-the-duplicate-number
    class Solution {
        public int findDuplicate(int[] nums) {
            for (int num : nums) {
                int idx = Math.abs(num) - 1;
                if (nums[idx] < 0) {
                    return Math.abs(num);
                }
                nums[idx] *= -1;
            }
            return -1;
        }
    }
}
