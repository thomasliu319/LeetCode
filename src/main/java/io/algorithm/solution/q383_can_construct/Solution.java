package io.algorithm.solution.q383_can_construct;

/**
 * @Author: jian.liu
 * @Description //383.赎金信
 * @Date: 2024/7/31 09:50
 */
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }

        int[] cnt = new int[26];
        for(char c:magazine.toCharArray()){
            cnt[c - 'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            cnt[c - 'a']--;
            if(cnt[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("aa","aab"));
    }

}
