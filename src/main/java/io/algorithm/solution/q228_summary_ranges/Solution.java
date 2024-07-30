package io.algorithm.solution.q228_summary_ranges;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jian.liu
 * @Description //汇总区间
 * @Date: 2024/7/26 17:30
 */
public class Solution {

    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<n){
            int cnt = 0;
            int cur = nums[i];
            int start = cur;
            while(i < n && nums[i] == cur){
                cnt++; i++; cur++;
            }
            cur--;
            if(cnt < 2){
                res.add(cur+"");
            } else {
                res.add(start+"->"+cur);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,2,4,5,7};
        List<String> res = solution.summaryRanges(nums);
        System.out.println(res);
    }





}
