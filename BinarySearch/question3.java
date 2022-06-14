package com.manav.BinarySearch;

public class question3 {
    // 852. Peak Index in a Mountain Array - leetcode
    // links - https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {
        int[]  arr = {0, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    // Time Complexity - O(LogN)
    // Space Complexity - O(1)
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if( mid > 0 && arr[mid] >  arr[mid-1] && arr[mid] > arr[mid+1]) {
                return mid;
            }
            else if(mid > 0 && arr[mid] <  arr[mid-1]){
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
