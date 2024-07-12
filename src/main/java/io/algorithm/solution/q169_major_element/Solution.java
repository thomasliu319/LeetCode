package io.algorithm.solution.q169_major_element;

/**
 * @Author: jian.liu
 * @Description //多数元素
 * @Date: 2024/7/12 10:15
 */
public class Solution {

    public int majorityElement(int[] nums) {
            int count = 0;
            Integer candidate = null;

            for (int i = 0; i < nums.length; i++) {
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
                else if (candidate == nums[i]) {
                    count++;
                }
                else {
                    count--;
                }
            }

            return candidate;

    }

}
