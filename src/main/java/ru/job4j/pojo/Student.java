package ru.job4j.pojo;
import java.util.Date;

public class Student {
    private String namFamPat;
    private String studyGroup;
    private Date entrance;

    public String getNamFamPat() {
        return namFamPat;
    }

    public void setNamFamPat(String namFamPat) {
        this.namFamPat = namFamPat;
    }

    public String getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(String studyGroup) {
        this.studyGroup = studyGroup;
    }

    public Date getEntrance() {
        return entrance;
    }

    public void setEntrance(Date entrance) {
        this.entrance = entrance;
    }
}
