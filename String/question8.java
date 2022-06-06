package com.manav.String;

public class question8 {

    // 1768. Merge Strings Alternately - leetcode
    // link - https://leetcode.com/problems/merge-strings-alternately/
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    // Time Complexity - O(N)
    // Space Complexity - O(1)

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int length = Math.max(word1.length(),word2.length());
        int one = 0;
        int two = 0;
        for(int i = 0; i < length; i++){
            if(i < word1.length()){
                ans.append(word1.charAt(i));
            }
            if(i < word2.length()){
                ans.append(word2.charAt(i));
            }
        }
        return ans.toString();
    }
}
