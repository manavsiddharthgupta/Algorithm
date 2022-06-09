package com.manav.Sorting;

public class question5 {

    // 1608. Special Array With X Elements Greater Than or Equal X - leetcode
    // links - https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
    public static void main(String[] args) {

        int[] nums = {3, 5};
        System.out.println(specialArray1(nums));
        System.out.println(specialArray2(nums));
    }

    // Time Complexity - O(N*N)
    // Space Complexity - O(1)
    public static int specialArray1(int[] nums) {
        int max = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max  = nums[i];
            }
        }
        for(int i = 0; i <= max; i++){
            int special = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] >= i){
                    special++;
                }
            }
            if(special == i){
                return i;
            }
        }
        return -1;
    }

    // Time Complexity - O(N* LogN)
    // Space Complexity - O(1)
    public static int specialArray2(int[] nums) {
        int start = 0;
        int end = nums.length;
        while(start <= end){
            int mid = start + (end-start)/2;
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(mid <= nums[i]){
                    count++;
                }
            }
            if(mid == count){
                return mid;
            } else if(mid < count){
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
}
