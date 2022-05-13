package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private String name = " + extra cheese";

    public PizzaExtraCheese() {
        super();
    }

    @Override
    public String name() {
        return super.name() + name;
    }
}
