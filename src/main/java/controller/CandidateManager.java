/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import view.Menu;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Internship;
import common.Validation;

import java.util.Calendar;

/**
 *
 * @author Administrator
 */
public class CandidateManager extends Menu<String> {
    
    static String[] mc = {"Experience", "Fresher","Internship", "Searching", "Exit"};
    ArrayList<Candidate> list_C;

    public CandidateManager() {
        super("CANDIDATE MANAGEMENT SYSTEM", mc);
        list_C = new ArrayList<>();  
    }

    @Override
    public void execute(int n) {
       switch(n) {
           case 1: {
               addCandidate(0);
               break;
           }
           case 2: {
               addCandidate(1);
               break;
           }
           case 3: {
               addCandidate(2);
               break;
           }
           case 4: {
               search(list_C);
               break;
           }
           case 5: {
               System.exit(0);
           }
       }
    }
    
    public void addCandidate(int type) {
        while (true) {            
            int id = Validation.getID(list_C);
            String fname = Validation.getString("Enter first name: ");
            String lname = Validation.getString("Enter last name: ");
            int bd = Validation.getInt("Enter birth date: ", 1900, Calendar.getInstance().get(Calendar.YEAR));
            String address = Validation.getString("Enter address: ");
            String phone = Validation.getPhone();
            String email = Validation.getEmail();
            Candidate c = new Candidate(id, fname, lname, bd, address, phone, email, type);
            
            if(Validation.checkIdExist(list_C, id)){
                switch(type){
                    case 0:{
                        addExperience(c);
                        break;
                    }
                    case 1:{
                        addFresher(c);
                        break;
                    }
                    case 2:{
                        addInternship(c);
                        break;
                    }
                }
            }
            else{
                System.out.println("Id has exist");
                break;
            }
            
            if(!Validation.getYesNo("Do you want to continue(Y,N)").equalsIgnoreCase("Y")){
                displayCandidate();
                break;
            }
        }  
    }
    
    public void addExperience(Candidate candidate) {
       int yearExperience = Validation.getExprience(candidate.getBd());
        String skill = Validation.getString("Enter skill: ");
        list_C.add(new Experience(yearExperience,skill,candidate.getId(),candidate.getFirstname(),candidate.getLastname(),
                candidate.getBd(),candidate.getAddress(),candidate.getPhone(),candidate.getEmail(),
                candidate.getType()));
        System.out.println("---------------Create success---------------");

    } 
    
    public void addFresher(Candidate candidate) {
        String graduationDate = Validation.getString("Enter graduation date: ");
        String graduationRank = Validation.getGraduationRank();
        String[] choice = {"Experience", "Fresher","Internship", "Searching", "Exit"};       
        String education = Validation.getString("Enter university: ");
        list_C.add(new Fresher(graduationDate,graduationRank,education, candidate.getId(),candidate.getFirstname(),candidate.getLastname(),
                candidate.getBd(),candidate.getAddress(),candidate.getPhone(),candidate.getEmail(),
                candidate.getType()));
        System.out.println("---------------Create success---------------");
    } 
    
    public void addInternship(Candidate candidate) {
        String major = Validation.getString("Enter major: ");
        String semester = Validation.getSemester();
        String university = Validation.getString("Enter university: ");
        list_C.add(new Internship(major,semester,university,candidate.getId(),candidate.getFirstname(),candidate.getLastname(),
                candidate.getBd(),candidate.getAddress(),candidate.getPhone(),candidate.getEmail(),
                candidate.getType()));
        System.out.println("---------------Create success---------------");
    } 
    
    public void displayCandidate() {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        displayType("Experience");
        System.out.println("==========FRESHER CANDIDATE==============");
        displayType("Fresher");
        System.out.println("===========INTERN CANDIDATE==============");
        displayType("Internship");
    }
    
    public void displayType(String nameclass) {
        for(Candidate x : list_C) {
            if(x.getClass().getSimpleName().equals(nameclass)) {
                System.out.println(x.getFirstname() + " " + x.getLastname());
            }
        } 
    }
    
    public void search(ArrayList<Candidate> candidates){
        
        System.out.println("---------------------------------------------");
        if(candidates.isEmpty()){
            System.out.println("---------------List empty---------------");
            return;
        }
        displayCandidate();
        String nameSearch = Validation.getString("Enter name to search(First name or Last name): ");
        int count = 0;
        int type = Validation.getInt("Enter type of candidate: ", 0, 2);
        for(Candidate c:candidates){
            if(c.getType() == type && c.getFirstname().equalsIgnoreCase(nameSearch) || c.getLastname().equalsIgnoreCase(nameSearch)){
                System.out.println(c.toString());
                count++;
            }
        }
        if(count ==0){
            System.out.println("Cannot found");
        }
    }
}
