package JAVA.MEDIUM.TwoPointers;

public class ContainerWithMostWater {
    //https://leetcode.com/problems/container-with-most-water
    class Solution {
        public int maxArea(int[] height) {
            int left=0;
            int right=height.length-1;
            int maxAr=0;
            while(left<right){
                maxAr=Math.max(maxAr,(Math.min(height[left],height[right])*(right-left)));
                if(height[left]<height[right]){
                    left++;
                }else{
                    right--;
                }
            }
            return maxAr;
        }
    }
}
