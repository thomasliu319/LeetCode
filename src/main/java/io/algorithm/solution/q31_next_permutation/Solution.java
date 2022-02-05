package io.algorithm.solution.q31_next_permutation;

/**
 * @Author: jian.liu
 * @Description //下一个排列
 * @Date: 2022/2/4 14:36
 */
public class Solution {

    public void nextPermutation(int[] nums) {

        int n = 0;
        if(nums== null || (n = nums.length)==0) return ;

        //从后往前查找第一次出现 nums[i] < nums[i+1]的位置
        int i = n - 2;

        for(;i>0&&nums[i]>nums[i+1];i--){
            //if i=-1则整体逆序

            if(i>=0){
                // 此时 nums[i+1, n-1]降序，查找其中大于nums[i]的最大下标，直接可以从后往前逆向找
                //因为有序可以练习一下二分查找
                int j = binarySearch(nums, i+1, n-1, nums[i]);

                //交换i, j
                swap(nums, i, j);
            }
        }
        //此时 nums[i+1, n-1]仍然降序，将其改为升序，只需要反转即可
        reverse(nums, i+1, n-1);
    }



    // nums[left, right] 逆序，查找其中 > target 的 最大下标
    private int binarySearch(int[] nums, int left, int right, int target) {
        while(left <= right){
            int mid = (left+right)>>>1;

            if(nums[mid]>target){
                left = mid + 1; //尝试再缩小区间
            }else{
                right = mid -1;
            }

        }
        return right;

    }

    private void reverse(int[] nums, int i, int j) {
        while(i<j){
            swap(nums, i++, j--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
