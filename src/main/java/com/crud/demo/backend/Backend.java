package com.crud.demo.backend;

import com.crud.demo.dao.StudentDAO;
import com.crud.demo.entity.Student;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Backend {

    private final StudentDAO studentDAO;

    public Backend(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void createStudent(String firstName, String lastName, String email) {
        Student student = new Student(firstName, lastName, email);
        studentDAO.save(student);
    }
     public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }
     public void deleteStudent(int studentId) {
         studentDAO.delete(studentId);
}

     public void update(Student theStudent){
         studentDAO.update(theStudent);
     }

}
