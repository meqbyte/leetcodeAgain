package org.example;

import java.util.Arrays;

public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = m + n - 1;
         m = m - 1;
         n = n - 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n]) {
                nums1[p--] = nums1[m--];
            } else {
                nums1[p--] = nums2[n--];
            }
        }

        while (m >= 0) {
            nums1[p--] = nums1[m--];
        }

        while (n >= 0) {
            nums1[p--] = nums2[n--];
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
