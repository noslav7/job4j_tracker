package ru.job4j.lambda;
import java.util.function.Consumer;

public class MethodReference {

    public void applyByInstance() {
        Consumer<String> consumer = (s) -> consumerByInstance(s);
        consumer.accept("Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumer = (s) -> MethodReference.consumerByClass(s);
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }
}
