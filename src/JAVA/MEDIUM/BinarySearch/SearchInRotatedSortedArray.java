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
        private int returnIndexOfLeast(int[] arr){
            int left=0,right=arr.length-1,mid=0;
            while(left<right){
                mid=left+(right-left)/2;
                if(arr[mid]>arr[right]) left=mid+1;
                else right=mid;
            }
            return left;
        }
        private int binarySearch(int[] arr,int left,int right,int target){
            while(left<=right){
                int mid=left+(right-left)/2;
                if(target==arr[mid]) return mid;
                else if(target<arr[mid]) right=mid-1;
                else left=mid+1;
            }
            return -1;
        }
    }
}
