package com.manav.Sorting;

import java.util.Arrays;

public class question3 {
    // 628. Maximum Product of Three Numbers
    // links - https://leetcode.com/problems/maximum-product-of-three-numbers/
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(maximumProduct1(nums));
        System.out.println(maximumProduct2(nums));
    }

    // Time Complexity - O(N*LogN)
    // Space Complexity - O(1)
    public static int maximumProduct1(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length-1]*nums[0]*nums[1], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }

    // Time Complexity - O(N)
    // Space Complexity - O(1)
    public static int maximumProduct2(int[] nums) {
        int negNum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                negNum++;
            }
        }
        if(nums.length == 3){
            return nums[0] * nums[1] * nums[2];
        }
        if(nums.length == 4){
            if(negNum > 1 && negNum != 4){
                int nums4 = minimum(nums);
                int nums5 = minimum(nums);

                int nums1 = maximum(nums);
                return nums1*nums4*nums5;
            }
            int nums1 = maximum(nums);
            int nums2 = maximum(nums);
            int nums3 = maximum(nums);

            return nums1*nums2*nums3;
        }
        int nums1 = maximum(nums);
        int nums2 = maximum(nums);
        int nums3 = maximum(nums);

        int nums4 = minimum(nums);
        int nums5 = minimum(nums);

        return Math.max(nums1*nums4*nums5, nums1*nums2*nums3);
    }
    private static int maximum(int[] nums){
        int max = -1001;
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max && nums[i] != 1001 && nums[i] != -1001){
                max = nums[i];
                maxIndex = i;
            }
        }
        nums[maxIndex] = -1001;
        return max;
    }

    private static int minimum(int[] nums){
        int min = 1001;
        int minIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min && nums[i] != -1001 && nums[i] != 1001){
                min = nums[i];
                minIndex = i;
            }
        }
        nums[minIndex] = 1001;
        return min;
    }
}
