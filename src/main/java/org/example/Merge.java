package org.example;

import java.util.Arrays;

public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = 0;
        int indexNum1 = 0;
        int indexNum2 = 0;
        while (indexNum1 < m && indexNum2 < n) {
            if (nums1[indexNum1] <= nums2[indexNum2]) {
                int t = nums1[p];
                nums1[p] = nums1[indexNum1];
                nums1[indexNum1] = t;
            } else {
                int t = nums1[p];
                nums1[p] = nums2[indexNum2];
                nums2[indexNum2] = t;
            }
            indexNum1++;
            indexNum2++;
            p++;
        }

        while (indexNum1 < m) {
            nums1[p++] = nums1[indexNum1++];
        }

        while (indexNum2 < n) {
            nums1[p++] = nums2[indexNum2++];
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        Merge.merge(nums1, m, nums2, n);

        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
