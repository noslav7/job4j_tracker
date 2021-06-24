package ru.job4j.tracker;

public class Programmer extends Engineer {
    private String notebookModel;

    public Programmer(String name, String sirname, String education, String birthday, String notebookModel) {
        super(name, sirname, education, birthday);
        this.notebookModel = notebookModel;
    }

    public Software development() {
        Software IDE = new Software();
        return IDE;
    }
    public static void main(String[] args) {
        Programmer javist = new Programmer("Ребрин", "Константин", "Технический Университет", "09.03.1983", "ASUS 1001");
        javist.getName();
        javist.getBirthday();
        javist.getEducation();
        javist.getSirname();
    }
}
