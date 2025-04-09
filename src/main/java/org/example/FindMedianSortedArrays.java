package org.example;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] result = merge(nums1, nums2);
        int cnt = nums1.length + nums2.length;
        double mid = 0;
        if (cnt % 2 == 0) {
            int i = cnt / 2 -1;
            int j = cnt / 2 ;
            mid = (double) (result[i] + result[j]) / 2;
        } else {
            mid = result[cnt / 2];
        }

        return mid;

    }

    private int [] merge(int[] num1, int[] num2) {
        int[] temp = new int[num1.length + num2.length];

        int k = 0;
        int p = 0;
        int q = 0;

        while (p < num1.length && q < num2.length) {
            if (num1[p] <= num2[q]) {
                temp[k++] = num1[p++];
            } else {
                temp[k++] = num2[q++];
            }
        }

        while (p < num1.length) {
            temp[k++] = num1[p++];
        }

        while (q < num2.length) {
            temp[k++] = num2[q++];
        }

        return temp;


    }

}
