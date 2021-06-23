package ru.job4j.tracker;

public class Engineer extends Profession {
private String blueprint;

    public Engineer() {
        super();
        this.blueprint = blueprint;
    }

    public static void main(String[] args) {
        Engineer designer = new Engineer();
        designer.getName();
        designer.getSirname();
        designer.getEducation();
        designer.getBirthday();
    }
}
