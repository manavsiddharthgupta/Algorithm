package com.manav.BinarySearch;

public class question6 {
    // 704. Binary Search - leetcode
    // link - https://leetcode.com/problems/binary-search/
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }
    // Time Complexity - O(LogN)
    // Space Complexity - O(1)
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
