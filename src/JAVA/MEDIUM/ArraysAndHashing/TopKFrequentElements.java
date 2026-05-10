package JAVA.MEDIUM.ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    //https://leetcode.com/problems/top-k-frequent-elements
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            // Step 1: Frequency map
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int num : nums) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }

            // Step 2: Bucket array
            List<Integer>[] bucket = new ArrayList[nums.length + 1];

            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                int num = entry.getKey();
                int freq = entry.getValue();

                if (bucket[freq] == null) {
                    bucket[freq] = new ArrayList<>();
                }
                bucket[freq].add(num);
            }

            // Step 3: Collect top k
            int[] res = new int[k];
            int idx = 0;

            for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
                if (bucket[i] != null) {
                    for (int num : bucket[i]) {
                        res[idx++] = num;
                        if (idx == k) return res;
                    }
                }
            }

            return res;
        }
    }
}
