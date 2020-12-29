package com.rob.String;

public class LongestPalindromicSubstring {
    public int[] longestPalindrome (String string){
        int[] currentLongest = {0,1};
        for (int i =1; i<string.length();i++ ){
            //palindrome centered at current item
            //odd = getLongestPalindromeFrom(string, i-1, i+1 );

            //even length paldinrome centered between current and previous letter
            //even = getLongestPalindromeFrom(string, i-1, i);

            //longest = max(longest,currentLongest);
            //currentLongest = string

        }

        return currentLongest;
    }

}
