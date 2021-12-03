package ru.job4j.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctForPrimitive {
    public static List<Integer> collect(int[] data) {
        List<Integer> listForStream = new ArrayList<Integer>();
        for (int i : data) {
            listForStream.add(i);
        }
    return listForStream.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
