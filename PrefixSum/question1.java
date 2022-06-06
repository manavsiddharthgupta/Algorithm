package com.manav.PrefixSum;

import java.util.Arrays;

public class question1 {
    // 1893. Check if All the Integers in a Range Are Covered - leetcode
    // link - https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/
    public static void main(String[] args) {
        int[][] ranges = {{1,2},{5,6},{3,4}};
        int left = 2;
        int right = 5;

        System.out.println(isCovered1(ranges,left,right));
    }

    // Time Complexity - O(NlogN)
    // Space Complexity - O(1)
    public static boolean isCovered1(int[][] ranges, int left, int right) {
        Arrays.sort(ranges, (x, y)->x[0]-y[0]);

        for(int i = 0; i < ranges.length; i++){
            if(ranges[i][0] <= left && ranges[i][1] >= left && left <= right){
                left = ranges[i][1]+1;
            }
        }
        if(left > right){
            return true;
        }
        return false;
    }


    // Time Complexity - O(N*N)
    // Space Complexity - O(1)
    public static boolean isCovered2(int[][] ranges, int left, int right) {
        for(int i = left; i <= right; i++){
            boolean check = false;
            for(int j = 0; j < ranges.length; j++){
                if(i >= ranges[j][0] && i <= ranges[j][1]){
                    check = true;
                    break;
                }
            }
            if(!check){
                return false;
            }
        }

        return true;
    }
}
