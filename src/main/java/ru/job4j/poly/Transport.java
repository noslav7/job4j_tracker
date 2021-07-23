package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(int numOfPass);

    int price(int fuel);
}
