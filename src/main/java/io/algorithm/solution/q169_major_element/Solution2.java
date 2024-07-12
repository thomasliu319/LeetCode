package io.algorithm.solution.q169_major_element;

/**
 * @Author: jian.liu
 * @Description //TODO
 * @Date: 2024/7/12 10:33
 */
public class Solution2 {

    /**
     * 摩尔投票：
     * 设输入数组 nums 的众数为 x ，数组长度为 n 。
     *
     * 推论一： 若记 众数 的票数为 +1 ，非众数 的票数为 −1 ，则一定有所有数字的 票数和 >0 。
     *
     * 推论二： 若数组的前 a 个数字的 票数和 =0 ，则 数组剩余 (n−a) 个数字的 票数和一定仍 >0 ，即后 (n−a) 个数字的 众数仍为 x 。
     *
     *
     *
     * 根据以上推论，记数组首个元素为 n
     * 1
     * ​
     *   ，众数为 x ，遍历并统计票数。当发生 票数和 =0 时，剩余数组的众数一定不变 ，这是由于：
     *
     * 当 n
     * 1
     * ​
     *  =x ： 抵消的所有数字中，有一半是众数 x 。
     * 当 n
     * 1
     * ​
     *
     * 
     * =x ： 抵消的所有数字中，众数 x 的数量最少为 0 个，最多为一半。
     * 利用此特性，每轮假设发生 票数和 =0 都可以 缩小剩余数组区间 。当遍历完成时，最后一轮假设的数字即为众数。
     *
     * 算法流程:
     * 初始化： 票数统计 votes = 0 ， 众数 x。
     * 循环： 遍历数组 nums 中的每个数字 num 。
     * 当 票数 votes 等于 0 ，则假设当前数字 num 是众数。
     * 当 num = x 时，票数 votes 自增 1 ；当 num != x 时，票数 votes 自减 1 。
     * 返回值： 返回 x 即可。
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {

        int  x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) {
                x = num;
            }
            votes += (x == num) ? 1 : -1;
        }

        return x;
    }


    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        Solution2 solution2 = new Solution2();

        int result = solution2.majorityElement(nums);
        
        System.out.println(result);


    }
}
