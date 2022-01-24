package io.algorithm.solution.q11_containerWithMostWater;

/**
 * @Author: jian.liu
 * @Description //盛最多水的容器
 * @Date: 2022/1/24 10:13
 */
public class Solution {

    public int maxArea(int[] height) {
        int i =0, j = height.length -1, res =0;

        while(i<j){
            res = height[i] < height[j] ?
                    Math.max(res, (j-i)*height[i++]):
                    Math.max(res, (j-i)*height[j--]);
        }
        return res;

    }
}
