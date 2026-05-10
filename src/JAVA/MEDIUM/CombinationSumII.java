package JAVA.MEDIUM;

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

    }
}
