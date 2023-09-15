/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Internship extends Candidate{
    
    private String majors;
    private String semester;
    private String universityname;

    public Internship() {
    }

    public Internship(String majors, String semester, String universityname, int id, String firstname, String lastname, int bd, String address, String phone, String email, int type) {
        super(id, firstname, lastname, bd, address, phone, email, type);
        this.majors = majors;
        this.semester = semester;
        this.universityname = universityname;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityname() {
        return universityname;
    }

    public void setUniversityname(String universityname) {
        this.universityname = universityname;
    }
    
    
}
