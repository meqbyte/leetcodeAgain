package org.example;

import java.util.HashMap;

public class LengthOfLongestSubstring {

    // divide into two steps
    // 1. distinct sub string
    // 2. max length
    public static int lengthOfLongestSubstring(String s) {
        // input check
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();
        // key , character in string
        // value , character index
        // if duplicate character, it's last position

        int maxLen = -1;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {

            // if s[i] exists in hashmap
                // substring have duplicate char , should restart index
            // s[i] not exists in hashmap
                // substring is ok, current char unique
                // put s[i] into hashmap

            if (hashMap.containsKey(s.charAt(i))) {
                int last = hashMap.get(s.charAt(i)) ;
                if (left <= last) {
                    left = last + 1;
                }
                hashMap.put(s.charAt(i), i);
            } else {
                hashMap.put(s.charAt(i), i);
            }

            int currLen = i - left +1;
            if (maxLen < currLen) {
                maxLen = currLen;
            }

        }

        return maxLen;
    }

    public static void main(String[] args) {
        String temp = "abcabca";
        int result = LengthOfLongestSubstring.lengthOfLongestSubstring(temp);
        System.out.println(result);

        String temp2 = "bbbbb";
        result = LengthOfLongestSubstring.lengthOfLongestSubstring(temp2);
        System.out.println(result);

        String temp3 = "pwwkew";
        result = LengthOfLongestSubstring.lengthOfLongestSubstring(temp3);
        System.out.println(result);

        String temp4 = "dvdf";
        result = LengthOfLongestSubstring.lengthOfLongestSubstring(temp4);
        System.out.println(result);

    }
}
