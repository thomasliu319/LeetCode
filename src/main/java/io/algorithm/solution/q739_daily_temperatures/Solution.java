package io.algorithm.solution.q739_daily_temperatures;

import java.util.Stack;

/**
 * @Author: jian.liu
 * @Description //739. 每日温度 堆栈解法
 * @Date: 2022/2/5 14:08
 */
public class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();

        int length = temperatures.length;

        int[] ans = new int[length];

        for(int i=0; i<length; i++){
            while(!stack.isEmpty()&& temperatures[i]> temperatures[stack.peek()]){
                int pre = stack.pop();
                ans[pre] = i - pre;
            }
            stack.add(i);
        }

        return ans;
    }


}
