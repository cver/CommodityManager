/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.java.model.person;

import app.java.model.List;
import app.java.model.Mail;

/**
 *
 * @author cver
 */
public class Member extends Customer {
    private String id;
    private String password;
    private String name;
    private boolean gender;
    private String birthday;
    
    public Member() {}

    public Member(String id, String password, String name, boolean gender, String birthday) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }
    
    public boolean sendMail(String receiveMan, String title, String contend) {
        return true;
    }
    
    public List<Mail> getMailbox() {
        return null;
    }
    
    public boolean deleteMail(String mailId[]) {
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
}
