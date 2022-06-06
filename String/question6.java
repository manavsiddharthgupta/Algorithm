package com.manav.String;

public class question6 {

    // 58. Length of Last Word - leetcode
    // link - https://leetcode.com/problems/length-of-last-word/

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    // Time complexity - O(N)
    // Space Complexity - O(1)

    public static int lengthOfLastWord(String s) {
        int l = 0;
        int i = s.length()-1;
        while(i >= 0){
            if(s.charAt(i) != ' '){
                break;
            }
            i--;
        }
        for(int j = i; j >= 0; j--){
            if(s.charAt(j) == ' '){
                break;
            }
            l++;
        }
        return l;
    }
}
