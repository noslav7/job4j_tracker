package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Moving by air");
    }

    @Override
    public void hasFuel() {
        System.out.println("The vehicle has got kerosene ");
    }
}
