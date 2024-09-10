package com.example.Student.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String batch;
    private String course1;
    private String course2;
    private String course;
    private String modeOfTransport;
    private String attendance; 
    private String classTeacher;
    private String remarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCourse1() {
        return course1;
    }

    public void setCourse1(String course1) {
        this.course1 = course1;
    }

    public String getCourse2() {
        return course2;
    }

    public void setCourse2(String course2) {
        this.course2 = course2;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getModeOfTransport() {
        return modeOfTransport;
    }

    public void setModeOfTransport(String modeOfTransport) {
        this.modeOfTransport = modeOfTransport;
    }
    
    public String getAttendance() {
    	return attendance;
    }
    
    public void setAttendance(String attendance) {
    	this.attendance = attendance;
    }
    
    public String getClassTeacher() {
    	return classTeacher;
    }
    
    public void setClassTeacher(String classTeacher) {
    	this.classTeacher = classTeacher;
    }
    
    public String getRemarks() {
    	return remarks;
    }
    
    public void setRemarks(String remarks) {
    	this.remarks = remarks;
    }
    
}
