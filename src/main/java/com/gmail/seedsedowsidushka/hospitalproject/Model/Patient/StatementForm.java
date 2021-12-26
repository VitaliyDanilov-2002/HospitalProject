package com.gmail.seedsedowsidushka.hospitalproject.Model.Patient;


import com.gmail.seedsedowsidushka.hospitalproject.Model.Role;

import java.sql.Date;
import java.util.Collections;

public class StatementForm {
    private String doctor;
    private String email;
    private String phone;
    private String username;
    private Date date;

    public Patient toPatient() {
        Patient patient = new Patient();
        patient.setDoctor(doctor);
        patient.setEmail(email);
        patient.setPhone(phone);
        patient.setUsername(username);
        patient.setDate(date);
        patient.setRoles(Collections.singleton(Role.USER));
        return patient;


    }
    public String getDoctor() {
        return doctor;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public Date getDate() {
        return date;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
