package JAVA.MEDIUM.ArraysAndHashing;

import java.util.*;

public class GroupAnagrams {
    //https://leetcode.com/problems/group-anagrams

    //Sorting as keys
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String,List<String>> res=new HashMap<>();
            for(String s:strs){
                char[] charArrayOfS=s.toCharArray();
                Arrays.sort(charArrayOfS);
                String key=new String(charArrayOfS);
                res.putIfAbsent(key,new ArrayList<>());
                res.get(key).add(s);
            }
            return new ArrayList<>(res.values());
        }
    }
}
