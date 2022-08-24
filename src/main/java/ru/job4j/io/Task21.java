package ru.job4j.io;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        int r, c, d;
        for (r = 1; r <= columnCount; r++) {
            for (c = 1; c < r; c++) {
                System.out.print(space);
                for (c = r; c <= columnCount; c++) {
                    if (r == 1 || c == r || c == columnCount) {
                        System.out.print(star);
                    } else {
                        System.out.print(space);
                    }
                }
                System.out.println();
            }
        }
        for (r = columnCount - 1; r >= 1; r--) {
            for (c = 1; c < r; c++) {
                System.out.print(space);
                for (c = r; c <= columnCount; c++) {
                    if (r == 1 || c == r || c == columnCount) {
                        System.out.print(star);
                    } else {
                        System.out.print(space);
                    }
                    System.out.println();
                }
            }
        }
    }
}
