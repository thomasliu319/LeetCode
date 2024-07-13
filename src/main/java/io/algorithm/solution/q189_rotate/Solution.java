package io.algorithm.solution.q189_rotate;

import java.util.Arrays;

/**
 * @Author: jian.liu
 * @Description //TODO
 * @Date: 2024/7/12 14:56
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;//轮转k次等于轮转k%n次
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }

    private void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
