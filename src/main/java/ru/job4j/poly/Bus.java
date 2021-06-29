package ru.job4j.poly;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println("Moving on a highway");
    }

    @Override
    public void hasFuel() {
        System.out.print("The vehicle has got gasoline ");
    }
}
