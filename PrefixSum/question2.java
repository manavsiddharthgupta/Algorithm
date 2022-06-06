package com.manav.PrefixSum;

public class question2 {

    // 1413. Minimum Value to Get Positive Step by Step Sum - leetcode
    // link - https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/

    public static void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};

        System.out.println(minStartValue1(nums));
        System.out.println(minStartValue2(nums));
    }

    //    Time Complexity - O(N*N)
    //    Space Complexity - O(1)
    public static int minStartValue1(int[] nums) {
        int initial = 1;

        while(true){
            boolean flag = false;
            int sum = initial;
            for(int i = 0; i < nums.length; i++){
                sum += nums[i];
                if(sum < 1){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return initial;
            } else {
                initial++;
            }
        }
    }


   //    Time Complexity - O(N)
   //    Space Complexity - O(1)

    public static int minStartValue2(int[] nums) {
        int minVal = 1;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum < minVal){
                minVal = sum;
            }
        }
        if(minVal > 0){
            return minVal;
        }
        minVal = -minVal;
        return minVal+1;
    }
}
