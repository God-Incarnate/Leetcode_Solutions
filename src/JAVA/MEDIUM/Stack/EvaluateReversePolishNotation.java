package JAVA.MEDIUM.Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    //https://leetcode.com/problems/evaluate-reverse-polish-notation
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> calculator = new Stack<>();
            for (String token : tokens) {
                if (!"*-+/".contains(token)) {
                    calculator.push(Integer.parseInt(token));
                    continue;
                }
                int b = calculator.pop();
                int a = calculator.pop();
                if (token.equals("*"))
                    calculator.push(a * b);
                else if (token.equals("+"))
                    calculator.push(a + b);
                else if (token.equals("-"))
                    calculator.push(a - b);
                else
                    calculator.push(a / b);

            }
            return calculator.pop();
        }
    }
}
