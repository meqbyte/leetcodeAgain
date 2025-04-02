package org.example;

public class LongestPalindrome {
    public String longestPalindrome(String s) {

        int maxLen = 0;
        int maxLeft = 0;
        int maxRight = 0;
        for (int i = 0; i < s.length(); i++) {

            int len1 = lenPalindrome(s, i, i);
            int len2 = lenPalindrome(s, i, i + 1);
            int currLeft = 0;
            int currRight = 0;
            if (len1 > len2) {
                currLeft = i - len1 / 2;
                currRight = i + len1 / 2;
            } else  {
                currLeft = i - (len2 / 2 - 1);
                currRight = i + len2 / 2;
            }

            if (currRight - currLeft + 1 > maxLen) {
                maxLeft = currLeft;
                maxRight = currRight;
                maxLen = currRight - currLeft + 1;
            }

        }

        return s.substring(maxLeft, maxRight + 1);
    }

    private int lenPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left + 1;
    }

}
