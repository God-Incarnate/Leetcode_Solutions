package JAVA.EASY;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    //https://leetcode.com/problems/valid-parentheses?envType=problem-list-v2&envId=stack

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
