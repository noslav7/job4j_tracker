package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private String name = " + extra tomato";

    public PizzaExtraCheeseExtraTomato() {
        super();
    }

    @Override
    public String name() {
        return super.name() + name;
    }
}
