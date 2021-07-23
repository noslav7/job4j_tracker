package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;
    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public void setName(String a380) {
        this.name = name;
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
                + '}';
    }
}
