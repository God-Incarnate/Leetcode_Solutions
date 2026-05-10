package JAVA.MEDIUM.BinarySearch;

public class SearchInRotatedSortedArray {
    //https://leetcode.com/problems/search-in-rotated-sorted-array
    class Solution {
        public int search(int[] nums, int target) {
            int left=0,pivot=returnIndexOfLeast(nums),right=nums.length-1;
            if(target>nums[right] && target<nums[left]) return -1;
            if(pivot==left){
                return binarySearch(nums,left,right,target);
            }else{
                if(target>nums[right]) right=pivot-1;
                else left=pivot;
                return binarySearch(nums,left,right,target);
            }
        }

    }
}
