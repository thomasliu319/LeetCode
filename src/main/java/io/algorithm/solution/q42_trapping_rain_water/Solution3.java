package io.algorithm.solution.q42_trapping_rain_water;

/**
 * @Author: jian.liu
 * @Description //接雨水 双指针
 * @Date: 2022/1/28 11:45
 */
public class Solution3 {

    public int trap(int[] height) {

        int sum = 0;
        int max_left  = 0;
        int max_right = 0;
        int left = 1;
        int right = height.length-2;//加右指针进去


        //最两端的列不用考虑，因为一定不会有水。所以下标从 1 到 length - 2
        for(int i=1; i<height.length -1; i++){

            //从左向右更新
            if(height[left -1] < height[right+1]){

                max_left = Math.max(max_left, height[left-1]);
                int min = max_left;
                //只有较小的一段大于当前列的高度才会有水，其他情况不会有水
                if(min > height[left]){
                    sum = sum +(min - height[left]);
                }
                left++;

            }else {
                max_right = Math.max(max_right, height[right+1]);
                int min = max_right;
                //只有较小的一段大于当前列的高度才会有水，其他情况不会有水
                if(min > height[right]){
                    sum = sum +(min - height[right]);
                }
                right--;
            }
        }

        return sum;
    }

}
