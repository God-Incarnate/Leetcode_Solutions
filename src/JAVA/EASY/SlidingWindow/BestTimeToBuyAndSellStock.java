package JAVA.EASY.SlidingWindow;

public class BestTimeToBuyAndSellStock {
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock

    class Solution {
        public int maxProfit(int[] prices) {
            int minPrice=Integer.MAX_VALUE;
            int maxProfit=0;
            for (int n: prices){
                if(n<minPrice){
                    minPrice=n;
                } else{
                    maxProfit=Math.max(maxProfit,n-minPrice);
                }
            }
            return maxProfit;
        }
    }
}
