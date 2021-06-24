package ru.job4j.tracker;

public class Doctor extends Profession {
private String speciality;

    public Doctor(String name, String sirname, String education, String birthday, String speciality) {
        super(name, sirname, education, birthday);
        this.speciality = speciality;
    }

    public Doctor(String name, String sirname, String education, String birthday) {
        super(name, sirname, education, birthday);

    }

    public Diagnosis heal(Patient patient) {
        Diagnosis illness = new Diagnosis();
        return illness;
    }

    public static void main(String[] args) {
        Doctor neurologist = new Doctor("Игорь", "Столяров", "Медицинский институт", "01.04.1955", "Невролог");
        neurologist.getName();
        neurologist.getSirname();
        neurologist.getBirthday();
        neurologist.getEducation();
    }

}
