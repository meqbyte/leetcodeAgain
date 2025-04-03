package org.example;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                // 如何使其value + 1
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
                if (hashMap.get(nums[i]) > n / 2) {
                    return nums[i];
                }
            }
        }

        return -1;

    }
}
