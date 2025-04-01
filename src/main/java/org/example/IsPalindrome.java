package org.example;

public class IsPalindrome {
    public static boolean isPalindrome(int x) {


        if (x < 0) {
            return false;
        }

        int div = 1;
        int t = x / 10;
        while (t != 0) {
            div = div * 10;
            t = t / 10;
        }

        System.out.println("div = " + div);

        int n = x;
        while (n != 0) {
            int left = n / div;
            int right = n % 10;

            System.out.print("left = " + left);
            System.out.println(", right = " + right);


            if (left != right) {
                return false;
            }

            n = n % div / 10;
            // bug
            div = div / 100;

        }

        return true;
    }

    public static void main(String[] args) {
        int x = 1000021;
        IsPalindrome.isPalindrome(x);
    }


}
