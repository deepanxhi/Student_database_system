package com.example.Student.service;

import com.example.Student.model.Student;
import com.example.Student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id).orElseThrow();
        student.setFirstName(studentDetails.getFirstName());
        student.setLastName(studentDetails.getLastName());
        student.setEmail(studentDetails.getEmail());
        student.setBatch(studentDetails.getBatch());
        student.setCourse1(studentDetails.getCourse1());
        student.setCourse2(studentDetails.getCourse2());
        student.setCourse(studentDetails.getCourse());
        student.setModeOfTransport(studentDetails.getModeOfTransport());
        student.setAttendance(studentDetails.getAttendance());
        student.setClassTeacher(studentDetails.getClassTeacher());
        student.setRemarks(studentDetails.getRemarks());
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}


