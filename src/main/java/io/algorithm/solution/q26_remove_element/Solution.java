package io.algorithm.solution.q26_remove_element;

/**
 * @Author: jian.liu
 * @Description //删除有序数组中的重复项
 * @Date: 2024/7/11 15:45
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;


    }
}
