package io.algorithm.solution.q32_longest_valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: jian.liu
 * @Description //最长有效括号 堆栈解法
 * @Date: 2022/2/12 15:16
 */
public class Solution {

    //建立一个栈，利用找到一对（）就出栈的原则
    //利用当前位置减去栈顶位置可得到pop出的括号数
    public int longestValidParentheses(String s) {

        //如果为空
        if(s == null || s.length() == 0) return 0;

        //建立一个栈
        Deque<Integer> stack = new ArrayDeque<>();

        //这一步可以防止当第一个Character是')'的时候发生越界异常
        stack.push(-1);
        //可以看到stack是[-1]
        System.out.println(stack);

        int res = 0;
        //遍历栈找寻合适的左右括号
        for(int i=0; i< s.length(); i++){
            //如果找到左括号则入栈，为寻找对应右括号做铺垫
            if(s.charAt(i) =='(') stack.push(i);
            else {
                //如果是右括号则出栈
                stack.pop();
                //但是如果栈是空的话还是得（单身的）把右括号放进来
                if(stack.isEmpty()) stack.push(i);
                else{
                    //当前全部人数减去剩余无法配对的人数（单身）即res
                    res = Math.max(res, i - stack.peek());
                }

            }

        }

        return res;
    }

}
