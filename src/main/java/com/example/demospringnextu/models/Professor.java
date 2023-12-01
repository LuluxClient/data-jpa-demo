package com.example.demospringnextu.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "professorId")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer professorId;

    private String name;

    private String firstName;

    private String mail;

    private String subject;

    @ManyToOne
    @JoinColumn(name = "schoolId")
    private School school;

    @OneToMany(mappedBy = "professor")
    @JsonManagedReference(value = "courseProfessor")
    private List<Course> courses;
}



// Ajouter les professeurs : un professeur est relié à une école, une école a plusieurs professeurs
// Un professeur a un id, un nom, un prenom, un mail et une matière (type String) et donne des cours