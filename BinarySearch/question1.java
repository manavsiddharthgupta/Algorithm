package com.manav.BinarySearch;

public class question1 {
    public static void main(String[] args) {
        int n = 78901;
        System.out.println(arrangeCoins1(n));
        System.out.println(arrangeCoins2(n));
    }


    // Time Complexity - O(Log(N))
    // Space Complexity - O(1)
    public static int arrangeCoins1(int n) {
        long start = 1;
        long end = n;

        while(start <= end){
            long mid = start + (end - start)/2;
            long coin = mid * (mid + 1)/2 ;
            if(n == coin){
                return (int)mid;
            } else if(n < coin){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int)end;
    }

    // Time Complexity - O(Sqrt(N))
    // Space Complexity - O(1)
    public static int arrangeCoins2(int n) {
        long sum = 1;
        int counting = 1;
        while(sum < n){
            counting++;
            sum += counting;
        }
        if(sum == n){
            return counting;
        }
        return counting-1;
    }
}
