package com.example.Student.Repository;
import com.example.Student.model.Student;
import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}

