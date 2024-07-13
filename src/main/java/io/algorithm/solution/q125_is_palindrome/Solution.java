package io.algorithm.solution.q125_is_palindrome;

/**
 * @Author: jian.liu
 * @Description //TODO
 * @Date: 2024/7/13 17:36
 */
public class Solution  {
    public boolean isPalindrome(String s){

        return s.replaceAll("[^A-Za-z0-9]", "").toLowerCase()
                .equals(
                        new StringBuilder(s.replaceAll("[^A-Za-z0-9]", "").toLowerCase()).reverse().toString());

    }
}
