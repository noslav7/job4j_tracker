package ru.job4j.stream.mapto;

import java.util.Arrays;
import java.util.List;

public class MapToIntExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Михаил", 35),
                new Person("Ольга", 26),
                new Person("Антон", 20),
                new Person("Виктор", 16),
                new Person("Анна", 29)
        );
        int sum = people.stream()
                .filter(e -> e.getAge() > 25)
                /* отбираем людей с возрастом более 25 лет */
                .mapToInt(Person::getAge) /* преобразуем поток Person в поток int */
                .peek(System.out::println) /* выводим полученные числа на печать */
                .sum(); /* получаем сумму возрастов отобранных людей */
        System.out.println("Сумма: " + sum);
    }
}
