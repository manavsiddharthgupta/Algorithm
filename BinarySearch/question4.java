package com.manav.BinarySearch;

public class question4 {
    public static void main(String[] args) {

    }
    

    public static int findKthPositive2(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr [i];
            }
        }
        int[] temp = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            temp[arr[i]] = arr[i];
        }
        int c = 0;
        for(int i = 1; i < temp.length; i++){
            if(temp[i] == 0){
                c++;
            }
            if(c == k){
                return i;
            }
        }
        return temp.length-c-1+k;
    }
}
