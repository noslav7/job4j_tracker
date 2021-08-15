package ru.job4j.stream;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class FlatIt {

    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
                 return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED), false)
                .flatMap(inner -> StreamSupport.stream(
                        Spliterators.spliteratorUnknownSize(inner, Spliterator.ORDERED), false))
                .collect(Collectors.toList());
    }
}