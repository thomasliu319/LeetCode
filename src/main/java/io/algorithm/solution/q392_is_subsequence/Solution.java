package io.algorithm.solution.q392_is_subsequence;

/**
 * @Author: jian.liu
 * @Description //判断子序列
 * @Date: 2024/7/22 09:59
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {

        //双指针
        //i指向s, j指向t
        //如果相等，i++,j++
        //如果不相等，j++
        //终止条件：s遍历完（成功）或者t遍历完但是s没遍历完（失败）
        int i,j;
        for(i=0,j=0;j<t.length() && i<s.length(); j++){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
        }

        return i >=s.length();
    }
}
