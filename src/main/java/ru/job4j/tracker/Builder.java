package ru.job4j.tracker;

public class Builder extends Engineer {
    private boolean helmet;

    public Builder() {
        super();
        this.helmet = helmet;
    }

    public BusStop build() {
        BusStop busStation = new BusStop();
        return busStation;
    }

    public static void main(String[] args) {
        Builder architect = new Builder();
        architect.getName();
        architect.getSirname();
        architect.getBirthday();
        architect.getEducation();
    }
}
