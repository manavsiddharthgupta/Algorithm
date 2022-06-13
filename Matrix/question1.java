package com.manav.Matrix;

public class question1 {
    // 1351. Count Negative Numbers in a Sorted Matrix - leetcode
    // https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1},{3, 2, 1, -1},{1, 1, -1, -2},{-1, -1, -2, -3}};
    }
    public static int countNegatives(int[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] < 0){
                    ans++;
                }
            }
        }
        return ans;
    }
}
