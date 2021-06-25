package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3");
            int select = Integer.valueOf(input.nextLine());
            if (select >= 1 && select <= 3) {
                turn = !turn;
                count = count - select;
                System.out.println(count + " спичек осталось на столе.");
            } else {
                System.out.println("Неверный ввод.");
            }
        }
            if (!turn) {
                System.out.println("Выиграл первый игрок");
            } else {
                System.out.println("Выиграл второй игрок");
            }
            System.out.println("Игра окончена.");
        }
}
