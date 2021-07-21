package ru.job4j.comparator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {
    /*
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.reverseOrder());
        String[] dataArray = data.toArray(new String[0]);
        int count = 0;
        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] != null) {
                dataArray[count++] = dataArray[i];
            }
        }
        while (count < dataArray.length) {
            dataArray[count++] = null;
        }
        data = Collectors.toList(dataArray);
        return data;
    }*/
}
