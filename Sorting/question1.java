package com.manav.Sorting;

import java.util.Arrays;

public class question1 {

    // 561. Array Partition I
    // links - https://leetcode.com/problems/array-partition-i/

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
    }
    // Time Complexity - O(N*log N)
    // Space Complexity - O(1)

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2 == 0){
                sum += nums[i];
            }
        }
        return sum;
    }

}
