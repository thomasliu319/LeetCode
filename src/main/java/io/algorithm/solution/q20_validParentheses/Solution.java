package io.algorithm.solution.q20_validParentheses;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;


/**
 * @Author: jian.liu
 * @Description //q20 有效的括号
 * @Date: 2022/1/24 09:32
 */
public class Solution {

    private static final Map<Character,Character> map = new HashMap<Character,Character>(){{
        put('{','}'); put('[',']'); put('(',')'); put('?','?');
    }};
    public boolean isValid(String s) {
        if(s.length() > 0 && !map.containsKey(s.charAt(0))) return false;
        LinkedList<Character> stack = new LinkedList<Character>() {{ add('?'); }};
        for(Character c : s.toCharArray()){
            if(map.containsKey(c)) stack.addLast(c);
            else if(map.get(stack.removeLast()) != c) return false;
        }
        return stack.size() == 1;
    }




}
