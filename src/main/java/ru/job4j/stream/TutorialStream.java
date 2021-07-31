package ru.job4j.stream;

import ru.job4j.search.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TutorialStream {
    public static class AnotherArray {
        private static int number;

        public AnotherArray(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "AnotherArray{"
                    + "number='" + number + '\''
                    + '}';
        }
    }
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = -5; i < 6; i++) {
            array.add(i);
        }
        List<Integer> negativeArray = array.stream().filter(
                AnotherArray -> AnotherArray.number > 0
        ).collect(Collectors.toList());
    }
}
