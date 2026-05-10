package JAVA.MEDIUM.Stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    //https://leetcode.com/problems/car-fleet
    class Solution {
        public int carFleet(int target, int[] position, int[] speed) {
            int n=position.length;
            double[][] posTim=new double[n][2];
            for(int i=0;i<n;i++){
                posTim[i][0]=position[i];
                posTim[i][1]=(double)(target-position[i])/speed[i];
            }

            Arrays.sort(posTim,(a, b)-> Double.compare(b[0],a[0]));
            Stack<Double> stack=new Stack<>();

            for(int i=0;i<n;i++){
                double currCarT=posTim[i][1];
                if(stack.isEmpty() || currCarT>stack.peek()) stack.push(currCarT);
            }
            return stack.size();
        }
    }
}
