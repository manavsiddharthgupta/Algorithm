package com.manav.String;

import java.util.Arrays;

public class question4 {

    // 14. Longest Common Prefix - leetcode
    // link - https://leetcode.com/problems/longest-common-prefix/

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix1(strs));
        System.out.println(longestCommonPrefix2(strs));
    }

    // Time complexity - O(N*M)
    // Space complexity - O(1)

    public static String longestCommonPrefix1(String[] strs) {
        String ans = "";
        int length = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++){
            if(length > strs[i].length()){
                length = strs[i].length();
            }
        }
        for(int i = 0; i < length; i++){
            boolean chck = true;
            char temp = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != temp){
                    chck = false;
                    break;
                }
            }
            if(chck){
                ans += temp;
            } else {
                break;
            }
        }
        return ans;
    }

    // Time complexity - O(N*LogM)
    // Space complexity - O(1)


    public static String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        int c = 0;
        String ans = "";
        while(c < strs[0].length()){
            if(strs[0].charAt(c) != strs[strs.length-1].charAt(c)){
                break;
            }
            ans += strs[0].charAt(c);
            c++;
        }
        return ans;
    }

}
