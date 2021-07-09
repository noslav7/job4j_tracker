package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> cells = new ArrayList<>();
        cells.add(0, "Petr");
        cells.add(1, "Ivan");
        cells.add(2, "Stepan");

        for (String cell : cells) {
            System.out.println(cell);
        }
    }
}
