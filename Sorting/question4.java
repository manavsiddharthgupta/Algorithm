package com.manav.Sorting;

import java.util.Arrays;

public class question4 {

    // 645. Set Mismatch - leetcode
    // Links - https://leetcode.com/problems/set-mismatch/submissions/
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums1(nums)));
        System.out.println(Arrays.toString(findErrorNums2(nums)));
    }

    // Time Complexity - O(N*LogN)
    // Space Complexity - O(1)
    public static int[] findErrorNums1(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                ans[0] = nums[i];
                break;
            }
        }
        int j = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == j){
                j++;
            } else {
                ans[1] = j;
                break;
            }
            if(nums[i] == ans[0]){
                i += 1;
            }
        }
        if(ans[1] == 0){
            ans[1] = j;
        }
        return ans;
    }

    // Time Complexity - O(N)
    // Space Complexity - O(1)
    public static int[] findErrorNums2(int[] nums) {
        int ans[] = {-1,-1};
        int n = nums.length;
        int index = 0;
        int temp = 0;
        while (index < nums.length) {
            int corr = nums[index]-1;
            if (nums[index] != nums[corr]) {
                temp = nums[index];
                nums[index] = nums[corr];
                nums[corr] = temp;
            } else {
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1) {
                ans[0]=nums[i];
                ans[1]=i+1;
            }
        }
        return ans;
    }
}
