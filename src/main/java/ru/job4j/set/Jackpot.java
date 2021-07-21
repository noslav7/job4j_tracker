package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        boolean win = false;
        Set<String> uniqueElements = new HashSet<String>(Arrays.asList(combination));
        if (uniqueElements.size() == 1){
            win = true;
        }
        return win;
    }
}
