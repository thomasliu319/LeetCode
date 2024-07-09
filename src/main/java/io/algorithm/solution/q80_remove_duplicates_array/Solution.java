package io.algorithm.solution.q80_remove_duplicates_array;

public class Solution {

    public int removeDuplicates(int[] nums) {
        // 数组中的一号和二号元素肯定不用删除
        int count = 2;
        for(int i = 2 ; i < nums.length ; i++){
            if(nums[i] != nums[count-2]){
                nums[count++] = nums [i];
            }
        }

        return count;
    }
}
