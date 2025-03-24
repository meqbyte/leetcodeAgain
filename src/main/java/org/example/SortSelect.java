package org.example;

public class SortSelect {

    public static int[] sort(int[] arr) {

        // parameter check
        // boundary check

        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            System.out.println("min index = " + min_index + ", value = " + arr[min_index]);
            int t = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = t;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] temp = {1,3,2,9,8,7,4,3,5};
        int [] res = SortSelect.sort(temp);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

}
