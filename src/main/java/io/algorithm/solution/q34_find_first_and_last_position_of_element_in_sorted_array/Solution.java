package io.algorithm.solution.q34_find_first_and_last_position_of_element_in_sorted_array;

/**
 * @Author: jian.liu
 * @Description //TODO
 * @Date: 2022/2/17 13:48
 */
public class Solution {

    int[] nums;
    int n;
    int target;

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};

        if(nums==null ||nums.length==0){
            return ans;
        }

        this.nums = nums;
        this.target = target;
        n = nums.length;

        ans[0] = findFirst();

        if(ans[0] == -1)
            return ans;
        ans[1] = findLast();
        return ans;
    }



    //寻找左边界
    private int findFirst() {

        int left = 0,right = n-1;
        while(left < right){
            int mid = (left+right)>>2;

            if(target == nums[mid])
                right = mid;

            else if(target < nums[mid])
                right = mid -1;
            else
                left = mid +1;

        }

        return nums[left] == target ? left: -1;
    }

    //寻找右边界
    private int findLast() {

        int left = 0,right = n-1;
        while(left < right){
            int mid = (left+right+1)>>2;

            if(target == nums[mid])
                right = mid;

            else if(target < nums[mid])
                right = mid -1;
            else
                left = mid +1;

        }

        return nums[left] == target ? left: -1;

    }
}
