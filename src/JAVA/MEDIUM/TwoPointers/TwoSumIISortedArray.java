package JAVA.MEDIUM.TwoPointers;

public class TwoSumIISortedArray {
    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] res=new int[2];
            int pt2=numbers.length-1;
            int pt1=0;
            while(pt1<pt2){
                if((numbers[pt1]+numbers[pt2])<target) pt1++;
                else if((numbers[pt1]+numbers[pt2])>target) pt2--;
                else {
                    res[0]=pt1+1;
                    res[1]=pt2+1;
                    break;
                }
            }
            return res;
        }
    }
}
