package org.example;

public class MyAtoi {
    public int myAtoi(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        int curr = 0;
        while (curr < s.length() && s.charAt(curr) == ' ') {
            curr++;
        }

        if (curr == s.length()) {
            return 0;
        }

        int sign = 1;
        if (s.charAt(curr) == '-') {
            sign = -1;
            curr++;
        } else if (s.charAt(curr) == '+') {
            curr++;
        }

        while (curr < s.length() && s.charAt(curr) == '0') {
            curr++;
        }


        long sum = 0;
        for (int i = curr; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isDigit(c)) {
                sum = sum * 10 + (c-'0');

                if (sign == 1 && sum > Integer.MAX_VALUE ) {
                    break;
                }

                if (sign == -1 && sum > (long)Integer.MAX_VALUE + 1) {
                    break;
                }

            } else {
                break;
            }
        }


        if (sign > 0 && sum > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (sign < 0 && sum > (long)Integer.MAX_VALUE + 1) {
            return Integer.MIN_VALUE;
        }  else {
            return (int) (sum * sign);
        }

    }

    private boolean isDigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

}
