package ru.job4j.function;

import java.util.function.BinaryOperator;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        BinaryOperator<StringBuilder> builder = (b1, b2) -> b1.append(" ").append(b2);
        System.out.println(
                "Строка после объединения: " + builder.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
        )
        );
    }
}