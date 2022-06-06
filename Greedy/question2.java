package com.manav.Greedy;

public class question2 {

    // 1616. Split Two Strings to Make Palindrome - leetcode
    // link - https://leetcode.com/problems/split-two-strings-to-make-palindrome/

    public static void main(String[] args) {
        String a = "ulaalk";
        String b = "jizaml";

        // u l a a l k                    j i z a m u
        // for a prefix + b suffix

        // check each index from start of a = i and end of b = j till j >= i && a.charAt(i) != b.charAt(j)
        // that a.charAt(i) == b.charAt(j)

        //          u i z a m u -- this may be palindrome
        //          u l a a l u -- this may be palindrome

        System.out.println(checkPalindromeFormation(a,b));
    }

    // Time complexity - O(N)
    // Space complexity - O(1)

    public static boolean checkPalindromeFormation(String a, String b) {
        return chck(a,b) || chck(b,a);
    }

    private static boolean chck(String a, String b){
        int i = 0; int j = b.length()-1;
        while(i < j){
            if(a.charAt(i) != b.charAt(j)){
                return isPalindrome(a,i,j) || isPalindrome(b,i,j) ;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j && s.charAt(i) == s.charAt(j)) {
            ++i;
            --j;
        }
        return i >= j;
    }
}
