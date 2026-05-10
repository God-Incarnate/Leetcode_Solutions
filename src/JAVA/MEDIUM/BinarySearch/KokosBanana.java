package JAVA.MEDIUM.BinarySearch;

public class KokosBanana {
    //https://leetcode.com/problems/koko-eating-bananas
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int left = 1;
            int right = getMax(piles);
            int answer = right;

            while (left <= right) {
                int midSpeed = left + (right - left) / 2;

                if (canFinish(piles, h, midSpeed)) {
                    answer = midSpeed;
                    right = midSpeed - 1;
                } else {
                    left = midSpeed + 1;
                }
            }

            return answer;
        }


    }
}
