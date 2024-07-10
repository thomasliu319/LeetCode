package io.algorithm.solution.q27_remove_element;

/**
 * @Author: jian.liu
 * @Description //TODO
 * @Date: 2024/7/10 11:06
 */
public class Solution {

    public int removeElement(int[] nums, int val) {

        if(nums == null || nums.length == 0) {return 0;}

        int left = 0;
        for(int right =0; right< nums.length; right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left ++;
            }
        }
        return left;
    }

}
