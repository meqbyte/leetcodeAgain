package org.example;

import java.util.*;

public class ReverseWords {
    public String reverseWords(String s) {
        int curr = 0;

        s = s.trim();

//        StringBuilder sb = new StringBuilder();
        List<String> words = new ArrayList<>();
        while (curr < s.length()) {

            while (curr < s.length() && s.charAt(curr) == ' ') {
                curr++;
            }

            int start = curr;
            while (curr < s.length() && s.charAt(curr) != ' ') {
                curr++;
            }
            int end = curr;

            words.add(s.substring(start, end));

//            String word = s.substring(start, end);
//            if (sb.isEmpty()) {
//                sb.append(word);
//            } else {
//                sb.insert(0, word + ' ');
//            }
        }

        Collections.reverse(words);

        return String.join(" ", words);
    }
}
