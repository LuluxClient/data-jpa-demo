package com.example.demospringnextu.controllers;

import com.example.demospringnextu.models.Student;
import com.example.demospringnextu.models.StudentGroup;
import com.example.demospringnextu.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") Integer id) {
        return studentService.getStudent(id);
    }

    // Recherche ou le nom de famille contient une chaine de caractères
    @GetMapping("/name_contains/{search}")
    public List<Student> getStudentWithNameContaining(@PathVariable("search") String search) {
        return studentService.getStudentWithNameContaining(search);
    }

    // Ajouter l'age et filtre age < à
    @GetMapping("/age_max/{search}")
    public List<Student> getStudentWithNameContaining(@PathVariable("search") Integer maxAge) {
        return studentService.getStudentWithAgeLessThan(maxAge);
    }


    // Filtre sur l'email avec contains à la fin du style qui finisse par @next-u.fr
    @GetMapping("/mail_domain/{mailDomain}")
    public List<Student> getStudentWithMailDomain(@PathVariable("mailDomain") String mailDomain) {
        return studentService.getStudentWithMailDomain(mailDomain);
    }


}
