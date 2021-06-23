package ru.job4j.pojo;
import java.util.Date;

public class Colledge {
    public static void main(String[] args) {
        Student usue = new Student();
        usue.setNamFamPat("Ярочкин Константин Александрович");
        usue.setStudyGroup("ЭП-17");
        usue.setEntrance(new Date());
        System.out.println("ФИО: " + usue.getNamFamPat() + "группа : " + usue.getStudyGroup()
                + " Дата поступления : " + usue.getEntrance());
    }
}
