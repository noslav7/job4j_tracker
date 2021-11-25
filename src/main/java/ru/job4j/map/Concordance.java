package ru.job4j.map;

import java.util.*;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> myMap = new HashMap<>();
        List<Character> myChars = new ArrayList<Character>();
        String noSymbols = s.replace(" ", "").replace(",", "");
        char[] sChars = new char[noSymbols.length()];
        for (int i = 0; i < sChars.length; i++) {
            myChars.add(noSymbols.charAt(i));
        }
        Set<Character> characterSet = new HashSet<>(myChars);
        String unique = characterSet.toString();
        String uniqueNoSpaces = unique.replace(" ", "")
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        char[] uniqueArray = uniqueNoSpaces.toCharArray();
        for (int i = 0; i < uniqueArray.length; i++) {
            List<Integer> listOfIndexes = new ArrayList<>();
            for (int j = 0; j < myChars.size(); j++) {
                if (uniqueArray[i] == noSymbols.charAt(j)) {
                    listOfIndexes.add(j);
                }
            }
            myMap.put(uniqueArray[i], listOfIndexes);
        }
        return myMap;
    }
}
