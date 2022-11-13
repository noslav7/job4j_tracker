package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ОДИН", "ДВА", "ТРИ"); // создаем лист strings
        strings.stream() // запускаем поток элементов листа strings
                .map(String::toLowerCase) // промежуточное действие с элементами потока в виде понижения регистра
                .forEach(System.out::println); // применяем действие - печать каждого элемента в консоль
    }
}
