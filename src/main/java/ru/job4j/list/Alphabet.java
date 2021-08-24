package ru.job4j.list;
import ru.job4j.comparator.NaturalOrder;

import java.util.*;

public class Alphabet {

    public static String reformat(String s) {
        String[] splittedString = s.split("");
        List<String> listOfStrings = new ArrayList<>(Arrays.asList(splittedString));
        listOfStrings.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        sb.append(listOfStrings);
        return sb.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .replace(" ", "");
    }
}
