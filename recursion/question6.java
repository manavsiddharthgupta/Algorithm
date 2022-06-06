package com.manav.recursion;

public class question6 {

    // 1342. Number of Steps to Reduce a Number to Zero
    // link - https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    // Time complexity - O(log N)
    // Space complexity - O(log N)

    public static int numberOfSteps(int num) {
        if(num == 0){
            return num;
        }
        int count = 1;

        if(num%2 == 0){
            count += numberOfSteps(num/2);
        } else {
            count += numberOfSteps(num-1);
        }
        return count;
    }
}
