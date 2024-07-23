package io.algorithm.solution.q55_can_jump;

/**
 * @Author: jian.liu
 * @Description //跳跃游戏
 * @Date: 2024/7/23 10:15
 */
public class Solution2 {
    public boolean canJump(int[] nums) {

        int n = nums.length;
        int rightmost = 0;
        for(int i = 0; i < n; ++i){
            if(i <= rightmost){
                rightmost = Math.max(rightmost, i + nums[i]);
                if(rightmost >= n - 1){
                    return true;
                }
            }

        }

        return  false;
    }

}
