package ru.job4j.tracker;

public class Doctor extends Profession {
private String speciality;

    public Diagnosis heal(Patient patient) {
        Diagnosis illness = new Diagnosis();
        return illness;
    }

    public static void main(String[] args) {
        Doctor neurologist = new Doctor();
        neurologist.getName();
        neurologist.getSirname();
        neurologist.getBirthday();
        neurologist.getEducation();
    }

}
