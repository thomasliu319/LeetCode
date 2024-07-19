package io.algorithm.solution.q66_plus_one;

/**
 * @Author: jian.liu
 * @Description //加一
 * @Date: 2024/7/19 09:34
 */
public class Solution {

    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i-- ){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i] += 1;
                return digits;
            }
        }

        //如果所有位都是进位，则长度+1
        digits = new int[digits.length +1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] digits = {1,2,3};
        int[] digits = {9,9};
        int[] plusOne = solution.plusOne(digits);
        for (int i = 0; i < plusOne.length; i++) {
            System.out.println(plusOne[i]);
        }
    }


}
