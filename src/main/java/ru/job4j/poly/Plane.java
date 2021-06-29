package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Moving by air");
    }

    @Override
    public boolean hasFuel(boolean fuel) {
        boolean kerosine = fuel;
        return kerosine;
    }

    public static void main(String[] args) {
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();
        Plane plane3 = new Plane();
        Vehicle vehiclePlane1 = plane1;
        Vehicle vehiclePlane2 = plane2;
        Vehicle vehiclePlane3 = plane3;
    }
}
