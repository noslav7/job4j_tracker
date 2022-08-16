package ru.job4j.io;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Значение x равно " + a + "; значение y равно " + b);
        System.out.println("Произведение x и y равно " + a * b);
        System.out.print("Сумма x и y равно " + (a + b));
    }
}
