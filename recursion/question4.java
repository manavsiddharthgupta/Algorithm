package com.manav.recursion;

import java.util.Arrays;

public class question4 {

    // Recursive Insertion Sort -Gfg
    // link - https://www.geeksforgeeks.org/recursive-insertion-sort/

    public static void main(String[] args) {
        int[] arr = { 9,8,7,6,5,4,3,2,1,0 };
        recursiveInsertionSort(arr, 1, 1);
        System.out.println(Arrays.toString(arr));
    }

    // Time complexity - O(N*N)
    // Space complexity - O(N)

    public static void recursiveInsertionSort(int[] arr, int i, int j){
        if(i >= arr.length){
            return;
        }
        if(j <= 0){
            return;
        }
        if(arr[j-1] > arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            recursiveInsertionSort(arr, i, j-1);
        }
        recursiveInsertionSort(arr,i+1, i+1);

    }
}
