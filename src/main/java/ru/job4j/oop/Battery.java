package ru.job4j.oop;

public class Battery {
    private int load;

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public Battery(int charge) {
        this.load = charge;
    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(15);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);
    }
}
