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
public class Fresher extends Candidate{
    
    private String graduationdate;
    private String graduationrank;
    private String education;

    public Fresher() {
    }
    
    public Fresher(String graduationdate, String graduationrank, String education, int id, String firstname, String lastname, int bd, String address, String phone, String email, int type) {
        super(id, firstname, lastname, bd, address, phone, email, type);
        this.graduationdate = graduationdate;
        this.graduationrank = graduationrank;
        this.education = education;
    }

    public String getGraduationdate() {
        return graduationdate;
    }

    public void setGraduationdate(String graduationdate) {
        this.graduationdate = graduationdate;
    }

    public String getGraduationrank() {
        return graduationrank;
    }

    public void setGraduationrank(String graduationrank) {
        this.graduationrank = graduationrank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
    
}
