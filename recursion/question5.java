package com.manav.recursion;

public class question5 {

    // Sum of digit of a number using recursion -- GFG
    // link - https://www.geeksforgeeks.org/sum-digit-number-using-recursion/

    public static void main(String[] args) {
        int num = 45632;
        System.out.println(helper(num));;
    }

    // Time complexity - O(logN)
    // Space complexity - O(logN)

    private static int helper(int num){
        if(num/10 <= 0){
            return num;
        }

        return num%10 + helper(num/10);
    }
}
