package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        String rsl = strings
                .stream() // запускаем поток из элементов листа strings
                .skip(2) // пропускаем 2 первых элемента
                .limit(2) // из получившегося потока оставляем только первые 2 элемента
                .findFirst() // получаем первый элемент из получившегося потока (тип Optional)
                .orElse("По умолчанию"); // получаем значение из Optional, а если его нет, то значение по умолчанию
        System.out.println(rsl);
    }
}
