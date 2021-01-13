package com.company;

import java.util.*;

public class PalindromeStack {

    public void checkPalindrome(String input) {

        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<input.length();i++) {
            st.push(input.charAt(i));
        }
    }
    public static void main(String[] args) {
        Source obj = new Source();
        Scanner in = new Scanner(System.in);
        String inputString = in .nextLine();
        obj.checkPalindrome(inputString);

    }
}
