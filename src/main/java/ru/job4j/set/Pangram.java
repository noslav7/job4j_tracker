package ru.job4j.set;

import java.util.*;

public class Pangram {
    public static boolean checkString(String s) {
        boolean pangram = true;
        String[] arrayS = s.split(" ");
        Set<String> uniqueCharacters = new HashSet<String>(Arrays.asList(arrayS));
        if (uniqueCharacters.size() > 26) {
            pangram = false;
        }
        return pangram;
    }
}