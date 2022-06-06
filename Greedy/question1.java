package com.manav.Greedy;

import java.util.Arrays;

public class question1 {

    // 2144. Minimum Cost of Buying Candies With Discount - leetcode
    // link - https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/submissions/

    public static void main(String[] args) {
        int[]  cost = {1,2,3};
        System.out.println(minimumCost(cost));
    }

    // Time complexity - O(N*N)
    // Space complexity - O(1)

    // Same Approach as O(N*logN) instead of inbuilt sorting algorithm use N*N sorting Algorithm.

    //-------------------------------------------------------------------------------------------------


    // Time complexity - O(N*logN)
    // Space complexity - O(1)

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int c = 1;
        int minCost = 0;
        for(int i = cost.length-1; i >= 0; i--){
            if(c%3 == 0){
                c = 0;
            } else {
                minCost += cost[i];
            }
            c++;
        }
        return minCost;
    }
}
