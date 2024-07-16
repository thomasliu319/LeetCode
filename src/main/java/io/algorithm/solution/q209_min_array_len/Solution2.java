package io.algorithm.solution.q209_min_array_len;

import java.util.Arrays;

/**
 * @Author: jian.liu
 * @Description //长度最小的子数组
 * @Date: 2024/7/14 15:03
 */
public class Solution2 {

    public int minArrayLen( int target, int[] nums) {
        int length = nums.length;
        int min = Integer.MAX_VALUE;
        int[] sums  = new int[length +1];
        for(int i = 1; i <= length; i++){
            sums[i] = sums[i -1] + nums[i-1];
        }

        for(int i = 0; i <= length; i++){
            int s = target + sums[i];
            int index = Arrays.binarySearch(sums, s);
            if(index < 0){
                index = ~index;
            }
            if(index <= length){
                min = Math.min(min, index - i);
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;

    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.minArrayLen(7, new int[]{2,3,1,2,4,3}));
    }


}
