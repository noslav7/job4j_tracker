package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                 tmp.add(start + "/" + el);
            }
        }
        List<String> tmpList = new ArrayList<>(tmp);
        sortDesc(tmpList);
        return tmpList;
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        List<String> forSortAsc = new ArrayList<>();
        List<String> forSortDesc = new ArrayList<>();
        for (int i = 0; i < orgs.size() - 1; i++) {
            if (orgs.get(i).length() > orgs.get(i + 1).length()) {
                forSortDesc.add(orgs.get(i));
            } else if (orgs.get(i).length() == orgs.get(i + 1).length()) {
                forSortAsc.addAll(orgs.subList(i, orgs.size()));
                break;
            }
        }
        forSortDesc.sort(new DepDescComp());
        sortAsc(forSortAsc);
        forSortDesc.addAll(forSortAsc);
    }
}
