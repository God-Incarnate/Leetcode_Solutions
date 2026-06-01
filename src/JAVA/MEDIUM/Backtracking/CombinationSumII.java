package JAVA.MEDIUM.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    //https://leetcode.com/problems/combination-sum-ii
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> result=new ArrayList<>();
            Arrays.sort(candidates);
            backtrack(0,target,new ArrayList<>(),candidates,result);
            return result;
        }
        private void backtrack(int index,int target,List<Integer> cur, int[] nums,List<List<Integer>> result){
            if(target==0){
                result.add(new ArrayList<>(cur));
                return;
            }
            for(int i=index;i<nums.length;i++){
                if(i>index && nums[i]==nums[i-1]) continue;
                if(nums[i]>target) break;
                cur.add(nums[i]);
                backtrack(i+1,target-nums[i],cur,nums,result);
                cur.remove(cur.size()-1);
            }
        }
    }
}
