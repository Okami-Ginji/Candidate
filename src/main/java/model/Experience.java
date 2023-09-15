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
public class Experience extends Candidate{
    
    private int expinyear;
    private String proskill;

    public Experience() {
    }

    public Experience(int expinyear, String proskill, int id, String firstname, String lastname, int bd, String address, String phone, String email, int type) {
        super(id, firstname, lastname, bd, address, phone, email, type);
        this.expinyear = expinyear;
        this.proskill = proskill;
    }

    public int getExpinyear() {
        return expinyear;
    }

    public void setExpinyear(int expinyear) {
        this.expinyear = expinyear;
    }

    public String getProskill() {
        return proskill;
    }

    public void setProskill(String proskill) {
        this.proskill = proskill;
    }
    
    
}
