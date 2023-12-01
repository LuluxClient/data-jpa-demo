package com.example.demospringnextu.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "courseId")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;

    private String name;

    private int duration;  // En minutes ça chef

    @ManyToOne
    @JoinColumn(name = "studentGroupId")
    @JsonManagedReference(value = "courseStudentGroup")
    private StudentGroup studentGroup;

    @ManyToOne
    @JoinColumn(name = "professorId")
    @JsonManagedReference(value = "courseProfessor")
    private Professor professor;
}
// Ajouter un cours: qui a un nom et une durée
// Un cours est relié à un groupe d'étudiants
// Chaque cours est dispensé par un professeur