package org.example;

import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            hashSet.add(num);
        }

        int maxLen = 0;
        for (int el : hashSet) {
            if (!hashSet.contains(el - 1)) {
                int curr = el;
                int currLen = 0;

                while (hashSet.contains(curr)) {
                    currLen++;
                    curr++;
                }

                if (maxLen < currLen) {
                    maxLen = currLen;
                }

            }
        }

        return maxLen;
    }
}
