package io.algorithm.solution.q209_min_array_len;

/**
 * @Author: jian.liu
 * @Description //长度最小的子数组
 * @Date: 2024/7/14 13:52
 */
public class Solution {

    public int minSubArrayLen(int target, int[] nums) {

        int lo = 0, hi = 0, sum = 0, min = Integer.MAX_VALUE;
        while(hi < nums.length){
            sum += nums[hi++];
            while(sum >= target){
                min = Math.min(min, hi -lo);
                sum -= nums[lo++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(solution.minSubArrayLen(target, nums));
    }

}
