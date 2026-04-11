package JAVA.EASY;

public class ClimbingStairs {
    //https://leetcode.com/problems/climbing-stairs
    class Solution {
        public int climbStairs(int n) {
            if (n<=2) return n;
            int[] stepWays=new int[n+1];
            stepWays[1]=1;
            stepWays[2]=2;

            for(int i=3;i<=n;i++){
                stepWays[i]=stepWays[i-1]+stepWays[i-2];
            }
            return stepWays[n];
        }
    }
}
