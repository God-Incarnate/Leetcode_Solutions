package JAVA.EASY.OneDDP;

public class MinCostClimbingStairs {
    //https://leetcode.com/problems/min-cost-climbing-stairs
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int value0=cost[0];
            int value1=cost[1];
            for(int i=2;i<cost.length;i++){
                int costSoFar=cost[i]+Math.min(value0,value1);
                value0=value1;
                value1=costSoFar;
            }
            return Math.min(value0,value1);
        }
    }
}
