/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.crud.demo.dao;

import com.crud.demo.entity.Student;
import java.util.List;

public interface StudentDAO {
    
    void save(Student theStudent);
     List<Student> findAll();
     void delete(int student_id);
     void update(Student theStudent);
     Student findById(Integer id);
}
