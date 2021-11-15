package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {

    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            int count = 0;
            boolean value = false;
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    count++;
                }
                    if (count >= 2) {
                        value = true;
                        map.put(strings[j], value);
                    }
                }
            if (count == 1) {
                map.put(strings[i], value);
            }
            }
        return map;
    }
}
