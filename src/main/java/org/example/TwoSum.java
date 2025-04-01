package org.example;

import java.util.HashMap;

public class TwoSum {

    private HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hashMap.containsKey(diff)) {
                return new int[]{i, hashMap.get(diff)};
            } else {
                hashMap.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}
