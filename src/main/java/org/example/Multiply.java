package org.example;

public class Multiply {
    public String multiply(String num1, String num2) {


        int totalSum = 0;
        for (int i = num2.length() - 1; i >= 0; i--) {

            int curr = num2.charAt(i) - '0';
            int currWeight = power(num2.length() - 1 - i);

            int sum = 0;
            for (int j = num1.length() - 1; j >= 0; j--) {
                int currNum1 = num1.charAt(j) - '0';
                int currWeightNum1 = power(num1.length() - 1 - j);
                int temp = currNum1 * curr * currWeightNum1;
                sum += temp;
            }

            int temp2 = sum * currWeight;
            totalSum += temp2;


        }

        return String.valueOf(totalSum);


    }

    private int power(int n) {
        int weight = 1;
        for (int i = 0; i < n; i++) {
            weight *= 10;
        }
        return weight;
    }

}
