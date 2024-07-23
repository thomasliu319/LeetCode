package io.algorithm.solution.q55_can_jump;

/**
 * @Author: jian.liu
 * @Description //跳跃游戏
 * @Date: 2024/7/23 09:42
 */
public class Solution {

    public boolean canJump(int[] nums) {

        int n = nums[0];
        for(int i =0; i< nums.length; i++){
            if(nums[i] >= nums.length-i-1){
                return true;
            }

            //n代表最大步数，每走一步减少一步，移动到下一个数进行比较
            //如果该步数比n更大或相等，则用此步数替换n
            if(n > nums[i]){
                n--;
            }else{
                n = nums[i];
            }

            //当最大步数n为零则证明已经无法移动，返回false
            if(n == 0){
                return false;
            }

        }

        return  true;
    }



}
