package ru.job4j.stream;

import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);
        Optional<Integer> sum = nums.stream() // запускаем поток из элементов Integer
                .reduce((a, b) -> a + b); // сводим поток к единому значению (сумме) с помощью указанного BinaryOperator
        System.out.println(sum.get()); // получаем значение из Optional
    }
}
