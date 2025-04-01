package org.example;

import java.util.HashMap;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
