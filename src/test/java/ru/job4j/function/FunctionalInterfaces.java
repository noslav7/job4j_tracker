package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (i, s1) -> map.put(i, s1);
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        BiPredicate<Integer, String> biPred = (integer, string) -> integer % 2 == 0;
        for (Integer i : map.keySet()) {
            /*
                Замените проверку в if() на использование BiPredicate, он объявлен выше, требуется его реализовать.
             */
            if (i % 2 == 0 || map.get(i).length() == 4) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        /*
            Заменить создание ArrayList из значений Map на Supplier, объявлен ниже, требуется его реализовать.
         */
        Supplier<List<String>> sup = () -> new HashSet<String>(map.values());
        List<String> strings = new ArrayList<>(map.values());

        Consumer<String> con = () -> ;
        Function<String, String> func = string -> ;
        for (String s : strings) {
            System.out.println(s.toUpperCase());
            /*
                Заменить вывод строк на применение Consumer
                Заменить преобразование строк к строкам в верхнем регистре с помощью Function
                Необходимое объявлено выше, требуется их реализовать.
            */
        }
    }
}
