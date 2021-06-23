package ru.job4j.tracker;

public class Dentist extends Doctor {
    private boolean anesthesia;

    public Dentist() {
        super();
        this.anesthesia = anesthesia;
    }

    public Treatment treat(Patient patient) {
        Treatment healing = new Treatment();
        return healing;
    }

    public static void main(String[] args) {
        Dentist physician = new Dentist();
        physician.getName();
        physician.getSirname();
        physician.getBirthday();
        physician.getEducation();
    }
}
