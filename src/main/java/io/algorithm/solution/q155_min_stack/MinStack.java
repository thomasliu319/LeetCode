package io.algorithm.solution.q155_min_stack;

import java.util.Stack;

/**
 * @Author: jian.liu
 * @Description //最小栈
 * @Date: 2022/2/11 16:14
 */
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> min_stack;


    public MinStack() {
        stack = new Stack<>();
        min_stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(min_stack.isEmpty() || val <=min_stack.pop())
            min_stack.push(val);

    }

    public void pop() {
        if(stack.pop().equals(min_stack.peek()))
            min_stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }


}
