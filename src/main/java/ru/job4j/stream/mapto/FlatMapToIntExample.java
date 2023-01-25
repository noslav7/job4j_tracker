package ru.job4j.stream.mapto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapToIntExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};
        List<Integer> list = Stream.of(array1, array2, array3)
                /* запускаем поток из 3 массивов int */
                .flatMapToInt(Arrays::stream)
        /* трансформируем элементы потока (массивы) в потоки int */
                .boxed() /* упаковываем значения int в Integer, чтобы собрать их в лист */
                .collect(Collectors.toList()); /* собираем все элементы в лист */
        System.out.println(list);
    }
}
