package io.algorithm.solution.q42_trapping_rain_water;

/**
 * @Author: jian.liu
 * @Description //接雨水 动态规划
 * @Date: 2022/1/28 11:45
 */
public class Solution2 {

    public int trap(int[] height) {

        int sum = 0;
        int[] max_left  = new int[height.length];
        int[] max_right = new int[height.length];

        for(int i=1;i<height.length -1;i++){
             max_left[i] = Math.max( max_left[i-1], height[i-1]);
        }

        for(int i= height.length-2; i>=0;i--){
            max_right[i] = Math.max(max_right[i+1], height[i+1]);
        }



        //最两端的列不用考虑，因为一定不会有水。所以下标从 1 到 length - 2
        for(int i=1; i<height.length -1; i++){

            //找出左右两边最小的
            int min = Math.min(max_left[i], max_right[i]);
            //只有较小的一段大于当前列的高度才会有水，其他情况不会有水
            if(min > height[i]){
                sum = sum +(min - height[i]);
            }

        }

        return sum;
    }

}
