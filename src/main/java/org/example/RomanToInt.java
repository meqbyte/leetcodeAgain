package org.example;

public class RomanToInt {
    public int romanToInt(String s) {

        int curr = 0;
        int prev = 0;

        int sum = 0;
        while (curr < s.length()) {

            if (curr == prev) {
                curr++;
                continue;
            }

            if (s.charAt(curr) == 'V' && s.charAt(prev) == 'I') {
                sum += 4;
                curr++;
                prev = curr;
                continue;
            }

            if (s.charAt(curr) == 'X' && s.charAt(prev) == 'I') {
                sum += 9;
                curr++;
                prev = curr;
                continue;
            }

            if (s.charAt(curr) == 'L' && s.charAt(prev) == 'X') {
                sum += 40;
                curr++;
                prev = curr;
                continue;
            }

            if (s.charAt(curr) == 'C' && s.charAt(prev) == 'X') {
                sum += 90;
                curr++;
                prev = curr;
                continue;
            }

            if (s.charAt(curr) == 'D' && s.charAt(prev) == 'C') {
                sum += 400;
                curr++;
                prev = curr;
                continue;
            }

            if (s.charAt(curr) == 'M' && s.charAt(prev) == 'C') {
                sum += 900;
                curr++;
                prev = curr;
                continue;
            }

            if (s.charAt(prev) == 'I') {
                sum += 1;
                prev++;
                curr++;
                continue;
            }

            if (s.charAt(prev) == 'V') {
                sum += 5;
                prev++;
                curr++;
                continue;
            }

            if (s.charAt(prev) == 'X') {
                sum += 10;
                prev++;
                curr++;
                continue;
            }

            if (s.charAt(prev) == 'L') {
                sum += 50;
                prev++;
                curr++;
                continue;
            }

            if (s.charAt(prev) == 'C') {
                sum += 100;
                prev++;
                curr++;
                continue;
            }

            if (s.charAt(prev) == 'D') {
                sum += 500;
                prev++;
                curr++;
                continue;
            }

            if (s.charAt(prev) == 'M') {
                sum += 1000;
                prev++;
                curr++;
                continue;
            }

        }

//        if (prev <) {
//        }

    }
}
