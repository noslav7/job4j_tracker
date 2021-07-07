package ru.job4j.encapsulation.ooa;

public class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;
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

    @Override
    public void printModel() {
        System.out.println("Модель самолета " + name);
    }

    public void printCountEngine() {
        int countEngine = COUNT_ENGINE;
        if (name.equals("A380")) {
            countEngine = 4;
        }
        System.out.println("Количество двигателей равно " + countEngine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                +'}';
    }
}
