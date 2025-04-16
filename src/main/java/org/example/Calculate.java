package org.example;

import java.util.Collections;
import java.util.Stack;

public class Calculate {



    public int calculate(String s) {
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        int curr = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isOperator(s.charAt(i))) {
                operator.push(s.charAt(i));
                curr = 0;
            } else {
                curr = curr * 10 + (s.charAt(i)-'0');
            }
        }



    }

    private boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        }
        return false;
    }

}
