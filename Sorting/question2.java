package com.manav.Sorting;

import java.util.Arrays;

public class question2 {

    // 1051. Height Checker - leetcode
    // link - https://leetcode.com/problems/height-checker/

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker2(heights));
    }

    // Time Complexity - O(N*LogN)
    // Space Complexity - O(N)
    public static int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int ans = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i]){
                ans++;
            }
        }
        return ans;
    }

    // Time Complexity - O(N)
    // Space Complexity - O(N)
    public static int heightChecker2(int[] heights) {
        int[] expected = new int[101];
        int[] temp = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            expected[heights[i]] = expected[heights[i]]+1;
        }
        int j = 0;
        int k = 0;
        while(j < temp.length){
            if(expected[k] > 0){
                temp[j] = k;
            }
            j += expected[k];
            k++;
        }
        int curr = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] != 0){
                curr = temp[i];
            } else {
                temp[i] = curr;
            }
        }
        int ans = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] != heights[i]){
                ans++;
            }
        }
        return ans;
    }
}
