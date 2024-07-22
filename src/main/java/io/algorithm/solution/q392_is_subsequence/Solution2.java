package io.algorithm.solution.q392_is_subsequence;

/**
 * @Author: jian.liu
 * @Description //判断子序列
 * @Date: 2024/7/22 10:20
 */
public class Solution2 {

    public boolean isSubsequence(String s, String t) {

        if(s.length() ==0){return true;}
        for(int i = 0, j = 0; j < t.length(); j++){
            if(s.charAt(i) == t.charAt(j)){
                //若已经遍历完s,则提前返回true
                if(++i == s.length()){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isSubsequence("abc", "ahbgdc"));
    }

}
