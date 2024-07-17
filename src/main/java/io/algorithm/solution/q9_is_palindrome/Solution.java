package io.algorithm.solution.q9_is_palindrome;

/**
 * @Author: jian.liu
 * @Description //TODO
 * @Date: 2024/7/17 09:48
 */
public class Solution {

    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        int cur = 0;
        int num = x;
        while(num != 0 ){
            cur = cur*10 + num%10;
            num /= 10;
        }
        return cur == x;

    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(-121));

    }


}
