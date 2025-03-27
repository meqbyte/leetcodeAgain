package org.example;

public class SortBubble {

    public static void sort(int[] arr) {

        // n^2
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }


    }

    public static void main(String[] args) {
        int[] temp = {1,3,2,9,8,7,4,3,5};
        SortBubble.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
