/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.demo.entity;

import jakarta.persistence.*;


/**
 *
 * @author Josiah
 */
@Entity
@Table(name = "my_student")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int student_id;
    
    @Column(name = "first_name")
    private String firstname;
    
    @Column(name = "last_name")
    private String lastname;
    
    @Column(name = "email")
    private String email;
    
       public Student(){

    }
       
    public Student(String firstName, String lastName, String email){
        this.firstname = firstName;
        this.lastname = lastName;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStudent_id() {
        return student_id;
    }
    
    

    @Override
    public String toString() {
        return "Student{" + "student_id=" + student_id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + '}';
    }
    
    
    
}
