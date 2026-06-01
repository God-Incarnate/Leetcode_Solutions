package JAVA.MEDIUM.Heaps;

import java.util.Arrays;

public class KthLargestElementInArray {
    //https://leetcode.com/problems/kth-largest-element-in-an-array
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            int n=nums.length;
            return nums[n-k];
        }
    }
}
