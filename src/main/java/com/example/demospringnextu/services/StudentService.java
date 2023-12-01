package com.example.demospringnextu.services;

import com.example.demospringnextu.models.Student;
import com.example.demospringnextu.repositories.StudentRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Data
@RequiredArgsConstructor
@Service
@Transactional
public class StudentService {

    private final StudentRepository studentRepository;

    public Student getStudent(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }
}
