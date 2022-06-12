package com.manav.BinarySearch;

import java.util.Arrays;

public class question2 {

    // 34. Find First and Last Position of Element in Sorted Array - leetcode
    // links - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    // Time Complexity - O(LogN)
    // Space Complexity - O(1)
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }
    public static int search(int[] nums, int target, boolean left){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = mid;
                if(left){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
