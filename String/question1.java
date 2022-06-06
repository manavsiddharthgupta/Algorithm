package com.manav.String;

public class question1 {

    // 1332. Remove Palindromic Subsequences - leetcode
    // link - https://leetcode.com/problems/remove-palindromic-subsequences/

    public static void main(String[] args) {
        String  s = "baabb";
        System.out.println(removePalindromeSub(s));
    }

    // Time complexity - O(N)
    // space complexity - O(1)

    public static int removePalindromeSub(String s) {
        if(s.length() == 0){
            return 0;
        }
        if(isPalindrome(s)){
            return 1;
        }
        return 2;
    }

    private static boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return  true;
    }
}
