package JAVA.MEDIUM;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    //https://leetcode.com/problems/combination-sum
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result=new ArrayList<>();
            backtrack(0,target,candidates,new ArrayList<>(),result);
            return result;
        }
        private void backtrack(int index,int target,int[] nums,List<Integer> cur,List<List<Integer>> result){
            if(target==0){
                result.add(new ArrayList<>(cur));
                return;
            }
            if(target<0) return;
            for(int i=index;i<nums.length;i++){
                cur.add(nums[i]);
                backtrack(i,target-nums[i],nums,cur,result);
                cur.remove(cur.size()-1);
            }
        }
    }
}
