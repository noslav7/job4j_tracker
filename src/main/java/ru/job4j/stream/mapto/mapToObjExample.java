package ru.job4j.stream.mapto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class mapToObjExample {
    public static void main(String[] args) {
        List<String> list = IntStream.rangeClosed(1, 5)
        /* запускаем поток примитивных чисел int от 1 до 5 */
                .mapToObj(String::valueOf)
                /* преобразуем примитивные числа int в объекты String */
                .collect(Collectors.toList()); /* собираем строки в лист строк */
        System.out.println(list);
    }
}
