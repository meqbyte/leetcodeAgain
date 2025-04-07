package org.example;

public class PivotIndex {
    public int pivotIndex(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                sums[i] = 0;
            } else {
                sums[i] = sums[i - 1] + nums[i - 1];
            }

            int right = total - sums[i] - nums[i];
            if (sums[i] == right) {
                return i;
            }
        }

        return -1;

    }
}
