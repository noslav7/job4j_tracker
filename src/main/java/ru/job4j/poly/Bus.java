package ru.job4j.poly;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println("Moving on a highway");
    }

    @Override
    public boolean hasFuel(boolean fuel) {
        boolean gasoline = fuel;
        return gasoline;
    }

    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new Bus();
        Vehicle vehicleBus1 = bus1;
        Vehicle vehicleBus2 = bus2;
        Vehicle vehicleBus3 = bus3;
    }
}
