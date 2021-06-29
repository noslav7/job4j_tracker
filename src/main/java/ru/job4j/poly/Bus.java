package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void drive() {
        int distance = 3 * 60;
    }

    @Override
    public void Passengers(int numOfPass) {
        int numInVehicles = 5 * numOfPass;
    }

    @Override
    public int price(int fuel) {
        return 45 * fuel;
    }
}
