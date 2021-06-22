package ru.job4j.tracker;

public class Engineer extends Profession {
private String blueprint;

    public static void main(String[] args) {
        Engineer designer = new Engineer();
        designer.getName();
        designer.getSirname();
        designer.getEducation();
        designer.getBirthday();
    }
}
