package com.manav.recursion;

import java.util.Arrays;

public class question1 {

    // Sum triangle from array -- GFG
    // link - https://www.geeksforgeeks.org/sum-triangle-from-array/

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        sumOfArr(arr);

    }

    // Time complexity - O(N*N-1)
    // Space complexity - O(N*N-1)
    private static void sumOfArr(int[] arr){
        if(arr.length-1 <= 0){
            System.out.println(Arrays.toString(arr));
            return;
        }

        int[] nums = new int[arr.length-1];

        for(int i = 0; i < nums.length; i++){
            nums[i] = arr[i] + arr[i+1];
        }
        sumOfArr(nums);

        System.out.println(Arrays.toString(arr));
    }
}
