package org.example;

import java.util.HashMap;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                // TOOD 如何对value + 1
                int count = hashMap.get(s.charAt(i));
                count++;
                hashMap.put(s.charAt(i), count);
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!hashMap.containsKey(t.charAt(i))) {
                return false;
            } else {
                int count = hashMap.get(t.charAt(i));
                if (count > 0) {
                    count--;
                    hashMap.put(t.charAt(i), count);
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
