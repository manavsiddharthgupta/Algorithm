package com.manav.String;

public class question3 {

    // 1967. Number of Strings That Appear as Substrings in Word - leetcode
    // link - https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }

    // Time complexity - O(N*M)
    // Space complexity - O(1)

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i = 0; i < patterns.length; i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}
