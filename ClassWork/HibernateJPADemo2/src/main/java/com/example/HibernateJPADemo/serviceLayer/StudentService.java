package com.example.HibernateJPADemo.serviceLayer;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.HibernateJPADemo.entity.Student;
import com.example.HibernateJPADemo.repo.StudentRepository;
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Student getStudentById(long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student id not found - " + id));
    }
    public Student addStudent(Student theStudent) {
        theStudent.setId((long) 0.0);
        return studentRepository.save(theStudent);
    }
    public Student updateStudent(Student theStudent) {
        // this is where real service logic would go // e.g. checking the id exists before saving, so PUT
        // can't silently create a row (the gap flagged earlier)
        if (!studentRepository.existsById(theStudent.getId())) {
            throw new RuntimeException("Student id not found - " + theStudent.getId());
        }
        return studentRepository.save(theStudent);
    }
    public void deleteStudent(long id) {
        if (!studentRepository.existsById(id)) {
            throw new RuntimeException("Student id not found - " + id);
        }
        studentRepository.deleteById(id);
    }
}