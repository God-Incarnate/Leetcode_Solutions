package JAVA.MEDIUM;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    //https://leetcode.com/problems/permutations
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result=new ArrayList<>();
            boolean[] visited=new boolean[nums.length];
            backtrack(nums,visited,new ArrayList<>(),result);
            return result;
        }
        private void backtrack(int[] nums,boolean[] visited,List<Integer> cur,List<List<Integer>> result){
            if(cur.size()==nums.length){
                result.add(new ArrayList<>(cur));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if(visited[i]) continue;
                visited[i]=true;
                cur.add(nums[i]);
                backtrack(nums,visited,cur,result);
                cur.remove(cur.size()-1);
                visited[i]=false;
            }
        }
    }
}
