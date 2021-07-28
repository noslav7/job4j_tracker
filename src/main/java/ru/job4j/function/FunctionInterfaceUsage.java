package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> biFunc = (s, i) -> s.concat(" ").concat(i.toString());
        System.out.println("Результат работы функции: " + biFunc.apply("Name", 123));
        System.out.println("Результат работы функции: " + biFunc.apply("String number", 12345));
        }
    }
