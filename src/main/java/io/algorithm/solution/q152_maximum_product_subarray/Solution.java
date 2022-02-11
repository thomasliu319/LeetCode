package io.algorithm.solution.q152_maximum_product_subarray;

import static java.lang.Integer.MIN_VALUE;

/**
 * @Author: jian.liu
 * @Description //乘积最大子数组
 * @Date: 2022/2/10 11:04
 */
public class Solution {

    public int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE, imax = 1, imin =1;

        for(int i =0; i< nums.length; i++){
            if(nums[i] < 0){
                int temp = imax;
                imax = imin;
                imin = temp;
            }

            imax = Math.max(imax* nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);

            max = Math.max(max, imax);
        }

        return max;
    }
}
