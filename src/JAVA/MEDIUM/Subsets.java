package JAVA.MEDIUM;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    //https://leetcode.com/problems/subsets
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result=new ArrayList<>();
            result.add(new ArrayList<>());
            for(int num:nums){
                int size=result.size();
                for(int i=0;i<size;i++){
                    List<Integer> list=new ArrayList<>(result.get(i));
                    list.add(num);
                    result.add(list);
                }
            }
            return result;
        }
    }

    /*
    class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(int index,int[] nums,List<Integer> cur,List<List<Integer>>result){
        result.add(new ArrayList<>(cur));
        for(int i=index;i<nums.length;i++){
            cur.add(nums[i]);
            backtrack(i+1,nums,cur,result);
            cur.remove(cur.size()-1);
        }
    }
}
     */
}
