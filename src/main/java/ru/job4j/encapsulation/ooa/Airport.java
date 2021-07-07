package ru.job4j.encapsulation.ooa;

public class Airport {
    public static void main(String[] args) {
        Airbus airbus = new Airbus("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        airbus = new Airbus("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.setCountEngine(4);
        airbus.printCountEngine();

        airbus = new Airbus("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.setCountEngine(4);
        airbus.printCountEngine();
    }
}
