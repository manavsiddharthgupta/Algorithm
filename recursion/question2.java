package com.manav.recursion;

public class question2 {

    // Recursive Programs to find Minimum and Maximum elements of array -GFG
    // link - https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

    public static void main(String[] args) {
        int[] arr = {5,2,11,44,-1};
        System.out.println(findMin(arr,0));
        System.out.println(findMax(arr,0));
    }

    // For Find Min
    // Time complexity - O(N)
    // Space complexity - O(N)
    private static int findMin(int[] arr, int n){
        if(n >= arr.length-1){
            return arr[n];
        }
        return Math.min(arr[n],findMin(arr, n+1));
    }
    // For Find Max
    private static int findMax(int[] arr, int n){
        if(n >= arr.length-1){
            return arr[n];
        }

        return Math.max(arr[n],findMax(arr, n+1));
    }

    // For Find Min
    // Time complexity - O(N)
    // Space complexity - O(N)
    private static int findMin2(int[] arr, int n, int min){
        if(n >= arr.length){
            return min;
        }

        if(arr[n] < min){
            min = arr[n];
        }

        return findMin2(arr, n+1, min);
    }
    // For Find Max
    private static int findMax2(int[] arr, int n, int max){
        if(n >= arr.length){
            return max;
        }

        if(arr[n] > max){
            max = arr[n];
        }

        return findMax2(arr, n+1, max);
    }
}
