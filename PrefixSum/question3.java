package com.manav.PrefixSum;

import java.util.Arrays;

public class question3 {

    // 1685. Sum of Absolute Differences in a Sorted Array - leetcode
    // link - https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/

    public static void main(String[] args) {

        int[] nums = {2,3,5};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences1(nums)));
        System.out.println(Arrays.toString(getSumAbsoluteDifferences2(nums)));
    }

    // Time complexity - O(N*N)
    // Space Complexity - O(N)
    public static int[] getSumAbsoluteDifferences1(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j < nums.length; j++){
                sum += Math.abs(nums[i] - nums[j]);
            }
            ans[i] = sum;
        }
        return ans;
    }

    // Time complexity - O(N)
    // Space complexity - O(N)
    public static int[] getSumAbsoluteDifferences2(int[] nums) {
        int[] ans = new int[nums.length];
        int totalSum = 0;

        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }

        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            int rightSum = totalSum - leftSum;
            int sum = (nums[i]*i - leftSum) + (rightSum - ((nums.length-i)*nums[i]));
            ans[i] = sum;
            leftSum += nums[i];
        }
        return ans;
    }
}
