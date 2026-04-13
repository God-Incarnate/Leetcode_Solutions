package JAVA.EASY;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    //https://leetcode.com/problems/last-stone-weight
    class Solution {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
            for(int nums:stones){
                maxHeap.offer(nums);
            }
            while(maxHeap.size()!=1){
                int p=maxHeap.poll();
                int q=maxHeap.poll();
                maxHeap.offer(p-q);
            }
            return maxHeap.peek();
        }
    }
}
