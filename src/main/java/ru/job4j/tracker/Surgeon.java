package ru.job4j.tracker;

public class Surgeon extends Doctor {
    private boolean surgicalInstrument;

    public Surgeon(String name, String sirname, String education,
                   String birthday, boolean surgicalInstrument) {
        super(name, sirname, education, birthday);
        this.surgicalInstrument = surgicalInstrument;
    }

    public Treatment performOperation() {
        Treatment health = new Treatment();
        return health;
    }

    public static void main(String[] args) {
        Surgeon neuroSurgeon = new Surgeon("Олег", "Михайлов",
                "Медицинская академия", "01.01.1970", true);
        neuroSurgeon.getName();
        neuroSurgeon.getSirname();
        neuroSurgeon.getBirthday();
        neuroSurgeon.getEducation();
    }
}
