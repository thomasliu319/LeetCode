package io.algorithm.solution.q9_is_palindrome;

/**
 * @Author: jian.liu
 * @Description //  双指针处理回文数
 * @Date: 2024/7/17 10:03
 */
public class Solution2 {

    public boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;

            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isPalindrome(121));
        System.out.println(solution2.isPalindrome(-121));
    }
}
