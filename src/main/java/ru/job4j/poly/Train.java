package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Moving on rails");
    }

    @Override
    public boolean hasFuel(boolean fuel) {
        boolean dieselFuel = fuel;
        return dieselFuel;
    }

    public static void main(String[] args) {
        Train train1 = new Train();
        Train train2 = new Train();
        Train train3 = new Train();
        Vehicle vehicleTrain1 = train1;
        Vehicle vehicleTrain2 = train2;
        Vehicle vehicleTrain3 = train3;
    }
}
