package JAVA.MEDIUM;

public class TaskScheduler {
    //https://leetcode.com/problems/task-scheduler
    class Solution {
        public int leastInterval(char[] tasks, int n) {
            int[] freq=new int[26];
            for(char ch:tasks){
                freq[ch-'A']++;
            }
            int maxV=0;
            for (int num:freq){
                maxV=Math.max(maxV,num);
            }

            int countMax=0;
            for (int num: freq){
                if(num==maxV) countMax++;
            }

            int result=(maxV-1)*(n+1)+countMax;
            return Math.max(tasks.length,result);
        }
    }
}
