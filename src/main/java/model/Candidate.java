/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Candidate {
    
    protected int id;
    protected String firstname;
    protected String lastname;
    protected int bd;
    protected String address;
    protected String phone;
    protected String email;
    protected int type;

    public Candidate() {
    }

    public Candidate(int id, String firstname, String lastname, int bd, String address, String phone, String email, int type) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.bd = bd;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBd() {
        return bd;
    }

    public void setBd(int bd) {
        this.bd = bd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " | " + bd + " | " + address + " | " + phone + " | " + email + " | " + type;
    }
    
    
}
