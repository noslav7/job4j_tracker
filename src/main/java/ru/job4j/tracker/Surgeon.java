package ru.job4j.tracker;

public class Surgeon extends Doctor {
    private boolean surgicalInstrument;

    public Treatment performOperation() {
        Treatment health = new Treatment();
        return health;
    }

    public static void main(String[] args) {
        Surgeon neuroSurgeon = new Surgeon();
        neuroSurgeon.getName();
        neuroSurgeon.getSirname();
        neuroSurgeon.getBirthday();
        neuroSurgeon.getEducation();
    }
}
