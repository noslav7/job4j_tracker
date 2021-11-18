package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        int resultMinus = Calculator.minus(50);
        System.out.println(resultMinus);
        Calculator calculator = new Calculator();
        int div = calculator.divide(2);
        System.out.println(div);
        System.out.println(calculator.sumAllOperation(5));
    }
}
