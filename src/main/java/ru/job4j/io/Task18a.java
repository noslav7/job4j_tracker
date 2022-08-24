package ru.job4j.io;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task18a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(df.format(a * 4.0));
        System.out.println(df.format(2.0 * Math.PI * r));
        System.out.println(df.format(Math.PI * (r * r)));
    }
}
