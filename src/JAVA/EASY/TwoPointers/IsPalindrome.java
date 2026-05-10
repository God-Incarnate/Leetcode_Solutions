package JAVA.EASY.TwoPointers;

public class IsPalindrome {
    // https://leetcode.com/problems/palindrome-number
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reversedNum=0,original=x;
        while (x!=0){
            reversedNum=(reversedNum*10) + (x%10);
            x=x/10;
        }
        return reversedNum==original;
    }
}
