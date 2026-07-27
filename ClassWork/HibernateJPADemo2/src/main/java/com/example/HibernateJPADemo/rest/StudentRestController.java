
package com.example.HibernateJPADemo.rest;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.HibernateJPADemo.entity.Student;
import com.example.HibernateJPADemo.repo.StudentRepository;
import com.example.HibernateJPADemo.serviceLayer.StudentService;
@RestController
@RequestMapping("/api")
public class StudentRestController {
    private final StudentService studentService;
    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable long studentId) {
        return studentService.getStudentById(studentId);
    }
    // POST/PUT/DELETE follow the same pattern
}