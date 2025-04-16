package org.example;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int p = num1.length() - 1;
        int q = num2.length() - 1;

        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (p >= 0 && q >= 0) {

            int n1 = num1.charAt(p) - '0';
            int n2 = num2.charAt(q) - '0';
            int sum = (n1 + n2 + carry) % 10;
            carry = (n1 + n2 + carry) / 10;

//            result.insert(0, sum);
            result.append(sum);
            p--;
            q--;
        }

        while (p >= 0) {
            int n1 = num1.charAt(p) - '0';
            int sum = (n1 + carry) % 10;
            carry = (n1  + carry) / 10;
            p--;
//            result.insert(0, sum);
            result.append(sum);
        }

        while (q >= 0) {
            int n2 = num2.charAt(q) - '0';
            int sum = (n2 + carry) % 10;
            carry = (n2  + carry) / 10;
            q--;
//            result.insert(0, sum);
            result.append(sum);
        }

        if (carry > 0) {
//            result.insert(0, '1');
            result.append('1');
        }


        return result.reverse().toString();

    }
}
