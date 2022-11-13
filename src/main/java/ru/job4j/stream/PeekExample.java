package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<StringBuilder> names = Arrays.asList(
                new StringBuilder("Михаил"), new StringBuilder("Иван"), new StringBuilder("Елена")); // создаем лист объектов
        List<StringBuilder> editedNames = names
                .stream() // запускаем поток из объектов листа names
                .peek((el) -> el.append(" (Ученик Job4j)")) // промежуточный метод peek() для изменения объекта
                .sorted() // после peek() можно применять другие промежуточные методы
                .toList(); // собираем поток в лист
        System.out.println(editedNames);
    }
}
