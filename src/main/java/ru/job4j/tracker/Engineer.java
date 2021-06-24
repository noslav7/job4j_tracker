package ru.job4j.tracker;

public class Engineer extends Profession {
private String blueprint;

    public Engineer(String name, String sirname, String education, String birthday, String blueprint) {
        super(name, sirname, education, birthday);
        this.blueprint = blueprint;
    }

    public Engineer(String name, String sirname, String education, String birthday) {
        super(name, sirname, education, birthday);
    }

    public static void main(String[] args) {
        Engineer designer = new Engineer("Лев", "Фаерман", "Таллинский политехнический институт", "15.03.1950", "heatingEquipment");
        designer.getName();
        designer.getSirname();
        designer.getEducation();
        designer.getBirthday();
    }
}
