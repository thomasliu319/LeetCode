package io.algorithm.solution.q739_daily_temperatures;

/**
 * @Author: jian.liu
 * @Description //739. 每日温度 常规解法
 * @Date: 2022/2/5 14:08
 */
public class Solution2 {

    public int[] dailyTemperatures(int[] temperatures) {

        int length = temperatures.length;

        int[] ans = new int[length];

        for(int i=0; i<length; i++){
            int current = temperatures[i];
            if(current < 100){
                for(int j = i+1;j< length; j++){
                    if(temperatures[j]>current){
                        ans[i] = j - i;
                        break;
                    }
                }
            }
        }

        return ans;
    }


}
