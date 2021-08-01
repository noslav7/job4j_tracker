package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TutorialStream {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = -5; i < 6; i++) {
            array.add(i);
        }
        List<Integer> negativeArray = array.stream().filter(
                i -> i > 0
        ).collect(Collectors.toList());
    }
}
