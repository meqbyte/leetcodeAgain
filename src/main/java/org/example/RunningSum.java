package org.example;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int left = 0;
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum[i] = left + nums[i];
            left = sum[i];
        }
        return sum;
    }
}
