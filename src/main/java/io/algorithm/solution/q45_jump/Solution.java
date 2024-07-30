package io.algorithm.solution.q45_jump;

/**
 * @Author: jian.liu
 * @Description //跳跃游戏II
 * @Date: 2024/7/30 10:33
 */
public class Solution {

    public int jump(int[] nums) {
        int length = nums.length;

        int end = 0;

        int maxPosition = 0;

        int steps = 0;

        for(int i=0; i< length - 1; i++){
            maxPosition = Math.max(maxPosition, i+nums[i]);
            if(i == end){
                end = maxPosition;
                steps++;
            }
        }
        return steps;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,3,0,1,4};
        int jump = solution.jump(nums);
        System.out.println(jump);
    }
}
