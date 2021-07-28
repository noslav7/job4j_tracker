package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    /*
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (i, s) -> map.put(i, s);;
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        BiPredicate<Integer, String> biPred = (integer, s) -> integer % 2 != 0 || map.get(integer).length() == 4;
        for (Integer i : map.keySet()) {
            System.out.println("key: " + biPred + " value: " + biPred);
           }
        }
        List<String> strings;
        Supplier<List<String>> sup = () -> strings = new ArrayList<>(map);

        Consumer<String> con = (s) -> System.out.println(s);
        Function<String, String> func = (s) -> s.toUpperCase();
        for (String s : strings) {
           System.out.println(s);
        }*/
    }
