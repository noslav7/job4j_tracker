package ru.job4j.tracker;

public class Dentist extends Doctor {
    private boolean anesthesia;

    public Dentist(String name, String sirname, String education, String birthday, boolean anesthesia) {
        super(name, sirname, education, birthday);
        this.anesthesia = anesthesia;
    }

    public Treatment treat(Patient patient) {
        Treatment healing = new Treatment();
        return healing;
    }

    public static void main(String[] args) {
        Dentist physician = new Dentist("Татьяна", "Полянская", "Медицинская академия", "30.06.1965", true);
        physician.getName();
        physician.getSirname();
        physician.getBirthday();
        physician.getEducation();
    }
}
