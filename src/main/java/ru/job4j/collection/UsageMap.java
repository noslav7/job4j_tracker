package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> mapCollection = new HashMap<>();
        mapCollection.put("620014", "Rachkov Valentin Sergeevich");
        for (String key: mapCollection.keySet()) {
            String value = mapCollection.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
