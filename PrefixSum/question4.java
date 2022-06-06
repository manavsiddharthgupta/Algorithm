package com.manav.PrefixSum;

import java.util.Arrays;

public class question4 {

    // 238. Product of Array Except Self - leetcode
    // link - https://leetcode.com/problems/product-of-array-except-self/

    public static void main(String[] args) {
        int[] nums = { -1,1,0,-3,3 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    // Time complexity - 0(N)
    // Space complexity - O(N)

    public static int[] productExceptSelf(int[] nums) {
        int[] right_product = new int[nums.length];
        int[] left_product = new int[nums.length];
        right_product[0]=1;
        left_product[nums.length-1]=1;
        for (int i = 1; i <right_product.length; i++){
            right_product[i] = right_product[i-1] * nums[i-1];
        }
        for (int i = (left_product.length-2); i >=0 ; i--){
            left_product[i] = left_product[i+1] * nums[i+1];
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = right_product[i] * left_product[i];
        }
        return nums;
    }
}
