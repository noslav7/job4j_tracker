package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectionLambdaUsage {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("name");
        collection.add("top");
        collection.add("user");
        collection.add("precision");
        collection.add("post");

        Predicate<String> predicate = s -> s.length() == 4;
        collection.removeIf(predicate);

        collection.forEach(System.out::println);
    }
}
