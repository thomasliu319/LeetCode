package io.algorithm.solution.q120_minimum_total;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jian.liu
 * @Description //TODO
 * @Date: 2024/7/16 09:43
 */
public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();
        int[][] f = new int[n][n];
        f[0][0] = triangle.get(0).get(0);
        for(int i = 1; i < n; ++i){
            f[i][0] = f[i-1][0] + triangle.get(i).get(0);
            for(int j = 1; j < i; ++j){
                f[i][j] = Math.min(f[i-1][j-1], f[i-1][j])+ triangle.get(i).get(j);
            }
            f[i][i] = f[i-1][i-1] + triangle.get(i).get(i);

        }

        int minTotal = f[n-1][0];
        for(int i = 1; i < n; ++i){
            minTotal = Math.min(minTotal, f[n-1][i]);
        }

        return minTotal;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3, 4));
        triangle.add(List.of(6, 5, 7));
        triangle.add(List.of(4, 1, 8, 3));
        System.out.println(solution.minimumTotal(triangle));
    }

}
