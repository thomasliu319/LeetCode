package io.algorithm.solution.q13_roman_to_int;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: jian.liu
 * @Description //罗马数字转整数
 * @Date: 2024/7/24 17:14
 */
public class Solution {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        //存入所有的罗马数字和对应的阿拉伯数字
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int currentValue = map.get(s.charAt(i));
            if(i == 0){
                ans += currentValue;
                continue;
            }

            int lastValue = map.get(s.charAt(i - 1));
            if(currentValue > lastValue){
                ans += currentValue - 2*lastValue;
            } else {
                ans += currentValue;
            }

        }
        return ans;
    }

}
