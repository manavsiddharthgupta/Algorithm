package com.manav.recursion;

import java.util.Arrays;

public class question3 {

    // Recursive Bubble Sort - Gfg
    // link - https://www.geeksforgeeks.org/recursive-bubble-sort/

    public static void main(String[] args) {
        int[] arr = { 7, 6, 3, 9, 1};
        bubbleSort(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    // Time complexity - O(N*N)
    // Space complexity - O(N)
    private static void bubbleSort(int[] arr, int n, int j) {
        if (n >= arr.length - 1) {
            return;
        }
        if (j >= arr.length - 1 - n) {
            return;
        }
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }

        bubbleSort(arr, n, j + 1);
        if (j >= arr.length - 2 - n) {
            bubbleSort(arr, n + 1, 0);
        }
    }
}
