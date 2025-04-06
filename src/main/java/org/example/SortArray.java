package org.example;

public class SortArray {
    public int[] sortArray(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSort(nums, 0, nums.length-1,temp);
        return nums;
    }

    private void mergeSort(int[] arr, int left, int right, int[] temp) {

        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid,temp);
        mergeSort(arr, mid + 1, right,temp);
        merge(arr, left, mid, right,temp);
    }

    private void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int p = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[p++] = arr[i++];
            } else {
                temp[p++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[p++] = arr[i++];
        }

        while (j <= right) {
            temp[p++] = arr[j++];
        }

        for (int k = 0; k < p; k++) {
            arr[left + k] = temp[k];
        }

    }

}
