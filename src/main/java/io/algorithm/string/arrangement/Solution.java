package io.algorithm.string.arrangement;

/**
 * 给定两个字符串s1和s2，写一个函数来判断 s2 是否包含 s1的排列。
 * 换句话说，第一个字符串的排列之一是第二个字符串的 子串 。
 *
 * 示例 1：
 *
 * 输入: s1 = "ab" s2 = "eidbaooo"
 * 输出: True
 * 解释: s2 包含 s1 的排列之一 ("ba").
 * 示例 2：
 * 输入: s1= "ab" s2 = "eidboaoo"
 * 输出: False
 *
 *
 * 提示：
 * 输入的字符串只包含小写字母
 * 两个字符串的长度都在 [1, 10,000] 之间
 */
public class Solution {

    public boolean checkInclusion(String s1, String s2){

        int n = s2.length();
        int[] dict = new int[26];
        int[] freq = new int[26];

        int size = 0;

        for(char c: s1.toCharArray()){
            if(dict[c-'a'] == 0) size++;
            dict[c-'a']++;
        }
        int match = 0;
        int left = 0, right = 0;
        while(right < n){
            char rc = s2.charAt(right);
            freq[rc -'a']++;
            if(freq[rc-'a'] == dict[rc-'a']) match ++;
            while(size == match){
                if(right - left+1 == s1.length()) return true;
                char lc = s2.charAt(left);
                freq[lc - 'a']--;
                if(freq[lc -'a'] < dict[lc -'a'])match--;
                left++;
            }
            right++;
        }
        return false;
    }
}
