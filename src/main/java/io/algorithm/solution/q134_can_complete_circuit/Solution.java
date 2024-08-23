package io.algorithm.solution.q134_can_complete_circuit;

/**
 * @Author: jian.liu
 * @Description //加油站
 * @Date: 2024-08-21 10:38
 */
public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;
        int sum = 0;

        int minSum = Integer.MAX_VALUE,minSumIndex = 0;

        for(int i=0; i< n; i++){
            sum += gas[i] - cost[i];

            if(sum< minSum){
                minSumIndex = i;
                minSum = sum;
            }
        }

        if(sum < 0) return -1;
        else if (minSum >= 0) return 0;
        else return (minSumIndex + 1) % n;
    }
}
