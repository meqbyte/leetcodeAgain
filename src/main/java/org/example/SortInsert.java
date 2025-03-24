package org.example;

import java.util.ArrayList;

public class SortInsert {

    // 问题代码，好好分析下
    public static int[] sort(int[] arr) {

        int[] b = new int[arr.length];
        b[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            System.out.println("i = " + i + ", j= " + j);
            while (j > 0 && b[j] > arr[i]) {
                b[j] = b[j - 1];
                j--;
            }
            System.out.println(", j= " + j);
            if (j > 0) {
                b[j] = arr[i];
            }

        }

        return b;

    }

    public static void main(String[] args) {
        int[] temp = {1,3,2,9,8,7,4,3,5};
        int [] res = SortInsert.sort(temp);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

}
