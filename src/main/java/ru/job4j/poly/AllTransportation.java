package ru.job4j.poly;

public class AllTransportation {
    public static void main(String[] args) {
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();
        Plane plane3 = new Plane();
        Vehicle vehiclePlane1 = plane1;
        vehiclePlane1.move();
        vehiclePlane1.hasFuel();
        Vehicle vehiclePlane2 = plane2;
        vehiclePlane2.move();
        vehiclePlane2.hasFuel();
        Vehicle vehiclePlane3 = plane3;
        vehiclePlane3.move();
        vehiclePlane3.hasFuel();
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new Bus();
        Vehicle vehicleBus1 = bus1;
        vehicleBus1.move();
        vehicleBus1.hasFuel();
        Vehicle vehicleBus2 = bus2;
        vehicleBus2.move();
        vehicleBus2.hasFuel();
        Vehicle vehicleBus3 = bus3;
        vehicleBus3.move();
        vehicleBus3.hasFuel();
        Train train1 = new Train();
        Train train2 = new Train();
        Train train3 = new Train();
        Vehicle vehicleTrain1 = train1;
        vehicleTrain1.move();
        vehicleTrain1.hasFuel();
        Vehicle vehicleTrain2 = train2;
        vehicleTrain2.move();
        vehicleTrain2.hasFuel();
        Vehicle vehicleTrain3 = train3;
        vehicleTrain3.move();
        vehicleTrain3.hasFuel();
        Vehicle[] vehicles = new Vehicle[9];
        vehicles[0] = vehiclePlane1;
        vehicles[1] = vehiclePlane2;
        vehicles[2] = vehiclePlane3;
        vehicles[3] = vehicleTrain1;
        vehicles[4] = vehicleTrain2;
        vehicles[5] = vehicleTrain3;
        vehicles[6] = vehicleBus1;
        vehicles[7] = vehicleBus2;
        vehicles[8] = vehicleBus3;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
