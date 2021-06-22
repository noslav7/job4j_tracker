package ru.job4j.tracker;

public class Programmer extends Engineer {
    private String notebookModel;

    public Software development() {
        Software IDE = new Software();
        return IDE;
    }
    public static void main(String[] args) {
        Programmer javist = new Programmer();
        javist.getName();
        javist.getBirthday();
        javist.getEducation();
        javist.getSirname();
    }
}
