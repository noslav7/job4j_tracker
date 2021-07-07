package ru.job4j.encapsulation.ooa;

public class Airbus extends Aircraft {
    private int COUNT_ENGINE = 2;
    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String setName(String a380) {
        return name;
    }

    public String getName(String a380) {
        return name;
    }

    public void setCountEngine(int COUNT_ENGINE) {
        this.COUNT_ENGINE = COUNT_ENGINE;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета " + name);
    }

    public void printCountEngine() {
        System.out.println("Количество двигателей равно " + COUNT_ENGINE);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                +'}';
    }
}
