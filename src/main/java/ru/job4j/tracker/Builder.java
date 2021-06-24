package ru.job4j.tracker;

public class Builder extends Engineer {
    private boolean helmet;

    public Builder(String name, String sirname, String education, String birthday, boolean helmet) {
        super(name, sirname, education, birthday);
        this.helmet = helmet;
    }

    public BusStop build() {
        BusStop busStation = new BusStop();
        return busStation;
    }

    public static void main(String[] args) {
        Builder architect = new Builder("Олег", "Сергеев", "Политехничский институт", "10.05.1960", true);
        architect.getName();
        architect.getSirname();
        architect.getBirthday();
        architect.getEducation();
    }
}
