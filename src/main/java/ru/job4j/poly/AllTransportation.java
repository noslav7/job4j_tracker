package ru.job4j.poly;

public class  AllTransportation {
    public static void main(String[] args) {
   Vehicle urbanBus = new Bus();
   Vehicle countryBus = new Bus();
   Vehicle nationalPlane = new Plane();
   Vehicle internationalPlane = new Plane();
   Vehicle cargoTrain = new Train();
   Vehicle passengerTrain = new Train();
   Vehicle[] allTransport = { urbanBus, countryBus, nationalPlane, internationalPlane, cargoTrain, passengerTrain };
   for (Vehicle index : allTransport) {
       index.move();
       index.hasFuel();
        }
    }
}
