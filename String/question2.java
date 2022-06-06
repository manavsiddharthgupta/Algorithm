package com.manav.String;

public class question2 {

    // 925. Long Pressed Name - leetcode
    // link -  https://leetcode.com/problems/long-pressed-name/

    public static void main(String[] args) {
        String  name = "alex";
        String typed = "aaleex";

        System.out.println(isLongPressedName(name,typed));
    }


    // Time complexity - O(N)
    // Space complexity - O(1)

    public static boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;

        while(i < name.length()){
            int streak = 0;
            int preak = 0;

            char c = name.charAt(i);
            while(i < name.length() && name.charAt(i) == c){
                streak += 1;
                i++;
            }

            while(j < typed.length() && typed.charAt(j) == c){
                preak += 1;
                j++;
            }

            if(streak > preak){
                return false;
            }
        }

        if(j < typed.length()){
            return false;
        }

        return true;
    }
}
