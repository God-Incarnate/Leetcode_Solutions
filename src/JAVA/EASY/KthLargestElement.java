package JAVA.EASY;

import java.util.PriorityQueue;

public class KthLargestElement {
    //https://leetcode.com/problems/kth-largest-element-in-a-stream
    class KthLargest {
        int k;
        PriorityQueue<Integer> minHeap;

        public KthLargest(int k, int[] nums) {
            this.k=k;
            this.minHeap=new PriorityQueue<>();
            for (int i=0;i<nums.length;i++){
                add(nums[i]);
            }
        }



    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}
