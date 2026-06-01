package JAVA.MEDIUM.OneDDP;

public class HouseRobber {
    //https://leetcode.com/problems/house-robber
    class Solution {
        public int rob(int[] nums) {
            if(nums.length==1) return nums[0];
            int[] dp=new int[nums.length];
            dp[0]=nums[0];
            dp[1]=Math.max(nums[0],nums[1]);
            for(int i=2;i<nums.length;i++){
                dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
            }
            return dp[nums.length-1];
        }

    }
    /*
    class Solution {
    public int rob(int[] nums) {
        int prev1 = 0; // dp[i-1]
        int prev2 = 0; // dp[i-2]

        for (int num : nums) {
            int curr = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
     */
}
