package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Moving on rails");
    }

    @Override
    public void hasFuel() {
        System.out.println("The vehicle has got diesel fuel ");
    }
}
