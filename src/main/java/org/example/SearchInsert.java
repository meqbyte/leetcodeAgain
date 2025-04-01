package org.example;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            return 0;
        }

        // binary search
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid + 1;
            } else {
                left = mid + 1;
            }
        }

        return left;

    }
}
