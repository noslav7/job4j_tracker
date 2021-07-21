package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
            boolean isogram = true;
            char[] isoString = s.toCharArray();
            Set<Character> isoSet = new HashSet<>();
            for (char symbol : isoString) {
                if (!isoSet.add(symbol)) {
                    isogram = false;
                }
            }
            return isogram;
        }
    }