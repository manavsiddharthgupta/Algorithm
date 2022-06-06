package com.manav.String;

public class question7 {

    // leetcode - 2000. Reverse Prefix of Word
    // links - https://leetcode.com/problems/reverse-prefix-of-word/
    public static void main(String[] args) {
        String word = "abcd";
        char ch = 'd';
        reversePrefix(word,ch);
    }

    // Time Complexity - O(N)
    // Space Complexity - O(1)

    public static String reversePrefix(String word, char ch) {
        StringBuilder input1 = new StringBuilder();
        int index = 0;
        for(int i = 0; i < word.length(); i++){
            input1.append(word.charAt(i));
            index++;
            if(word.charAt(i) == ch){
                break;
            }
        }
        input1.reverse();
        if(input1.length() == word.length() && input1.charAt(0) != ch){
            return word;
        }

        String ans = input1.toString() + word.substring(index);
        return ans;
    }
}
