package JAVA.MEDIUM.BinarySearch;

public class BinarySearch2DMatrix {
    //https://leetcode.com/problems/search-a-2d-matrix
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m=matrix.length,n=matrix[0].length;
            int left=0;
            int right=m*n-1;
            int mid=0;

            while(left<=right){
                mid=left+(right-left)/2;
                int row=mid/n;
                int col=mid%n;
                int val=matrix[row][col];
                if(val==target) return true;
                else if (val<target) left=mid+1;
                else right=mid-1;
            }
            return false;
        }

    }
}
