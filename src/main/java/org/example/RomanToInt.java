package org.example;

import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i);
            if (i + 1 < s.length()) {
                Character next = s.charAt(i + 1);
                if (hashMap.get(curr) < hashMap.get(next)) {
                    sum -= hashMap.get(curr);
                } else {
                    sum += hashMap.get(curr);
                }
            } else {
                sum += hashMap.get(curr);
            }
        }

        return sum;

    }
}
