package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // 如何对nums做排序
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) {
                break;
            }
            // 去重
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int remain = 0 - nums[i];
            // 其 remain 只能在右边找 ？
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {

                if (nums[left] + nums[right] == remain) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);

                    // 去重
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;
                } else if (nums[left] + nums[right] < remain) {
                    left++;
                } else {
                    right--;
                }

            }

        }

        return result;
    }
}
