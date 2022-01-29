package io.algorithm.solution.q04_median_of_two_sorted_arrays;

/**
 * @Author: jian.liu
 * @Description //寻找两个正序数组的中位数
 * @Date: 2022/1/29 14:28
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        //因为数组是从检索0开始的，因此我们在这里必须+1，即索引(k+1)的数，才是第k个数。
        int left = (m+n+1)/2;
        int right = (m+n+2)/2;

        //将偶数和奇数的情况合并，如果是奇数，会求两次同样的k
        return (getKth(nums1, 0,n-1, nums2, 0, m-1, left)+getKth(nums1, 0, n-1, nums2, 0, m-1, right))*0.5;
    }


    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k){
            //因为索引和算数不同6-0=6，但是是有7个数的，因为end初始就是数组长度-1构成的
            //最后len代表当前数组（也可能是经过递归排除后的数组），符合当前条件的元素的个数
            int len1 = end1 - start1 +1;
            int len2 = end2 - start2 +1;

            //让len1的长度小于len2，这样就能保证如果有数组空了，一定是len1
            //就是如果len1的长度小于len2,把原来的get()中的参数互换位置，即原来的len2换成len1,这样保证len1永远比len2小
            if(len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k);

            //如果一个数组中没有元素了，那么即从剩余数组nums2的起始位置加K再减1
            //因为k代表个数而不是索引，那么从num2后再找k个数，即是num2+k-1处的索引处就行了。因为还包含
            // nums[start2]也是一个数，他在上一次迭代时并没有被排除
            if(len1 == 0) return nums2[start2+k-1];

            //如果k==1表明接近中位数了，即两个数组中start索引处，谁的值小，中位数就是谁
            // (start索引之前表示经过迭代已经被排出的不合格的元素，即数组没被抛弃的逻辑上的范围是nums[start]--->nums[end])。
            if(k==1) return Math.min(nums1[start1], nums2[start2]);

            //为了防止数组小于k/2,每次比较都会从当前数组所剩长度和k/2做比较，取其中小的(如果取大的数组就会越界)
            //然后如果数组len小于k/2，表示如果数组经过下一次遍历就会到末尾，然后后面就会在那个剩余的数组中寻找中位数
            int i= start1 + Math.min(len1, k/2) -1;
            int j= start2 + Math.min(len2, k/2) -1;

            //如果nums1[i]>nums2[j]表示nums2的数组中包含j索引之前的元素，逻辑上全部淘汰，即下次从j+1开始
            //而k则变为k-(j-start2+1)即减去逻辑上排除的元素个数（要加1，因为索引相减，相当于实际排除时要少一个）
            if(nums1[i]> nums2[j]){
               return  getKth(nums1, start1, end1, nums2, j+1, end2, k-(j-start2+1));
            }else{
               return  getKth(nums1, i+1, end1, nums2, start2, end2, k-(i-start1+1));
            }

    }

}
