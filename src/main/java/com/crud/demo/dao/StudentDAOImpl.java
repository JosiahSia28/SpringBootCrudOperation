/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud.demo.dao;

import com.crud.demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Josiah
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

    private EntityManager entityManager;
    
    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    
    
    @Override
    @Transactional
    public void save(Student theStudent) {
       if(theStudent.getStudent_id() == 0){
           entityManager.persist(theStudent);
       }else{
           entityManager.merge(theStudent);
       }
    }

 
    public List<Student> findAll() {
        return entityManager.createQuery("FROM Student", Student.class).getResultList();
    }

    

    @Override
    @Transactional
    public void delete(int student_id) {
       Student student = entityManager.find(Student.class, student_id);
    if (student != null) {
        entityManager.remove(student);
    }
    }

//    @Override
//    public void update(Student theStudent) {
//        entityManager.merge(theStudent);
//
//    }

    @Override
    @Transactional
    public void update(Student theStudent) {
       entityManager.merge(theStudent);
    }

    @Override
    public Student findById(Integer id) {
      return entityManager.find(Student.class, id);
    }


     
    
}
