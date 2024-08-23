package io.algorithm.solution.q198_rob;

/**
 * @Author: jian.liu
 * @Description //打家劫舍
 * @Date: 2024-08-23 16:30
 */
public class Solution2 {

    public int rob(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        int length = nums.length;
        if(length == 1){
            return nums[0];
        }

        int first = nums[0];
        int second =  Math.max(nums[0], nums[1]);

        for(int i =2; i < length; i++){
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
