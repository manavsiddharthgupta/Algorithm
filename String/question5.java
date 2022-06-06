package com.manav.String;

public class question5 {

    // 28. Implement strStr() -- leetcode
    // link - https://leetcode.com/problems/implement-strstr/
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack,needle));;
    }

    // Time complexity - O(N*M)
    // Space complexity - O(1)

    public static int strStr(String haystack, String needle) {
        int t = haystack.length();
        while (haystack.length() > 0){
            if(haystack.charAt(0) != needle.charAt(0)){
                haystack = haystack.substring(1);
            } else {
                if(haystack.length() < needle.length()){
                    return -1;
                }
                String temp = haystack.substring(0,needle.length());
                if(temp.equals(needle)){
                    return t-haystack.length();
                }
                haystack = haystack.substring(1);
            }
        }
        return -1;
    }
}
