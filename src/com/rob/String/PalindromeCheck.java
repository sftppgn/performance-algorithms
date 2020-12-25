package com.rob.String;

public class PalindromeCheck {
    //input string of chars, determine if string is palindrome - same front to back
    //return t/f

    public Boolean getPalindromeResult (String string){
        ReverseString reversedString = new ReverseString();

        String newString = new String();
        newString = reversedString.reverseString(string);

        return (newString.equals(string));
    }
}
