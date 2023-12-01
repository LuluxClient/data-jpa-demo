package com.example.demospringnextu.services;

import com.example.demospringnextu.models.Professor;
import com.example.demospringnextu.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    @Autowired
    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    public Optional<Professor> getProfessorById(Integer professorId) {
        return professorRepository.findById(professorId);
    }

    public List<Professor> getProfessorsByNameContaining(String search) {
        return professorRepository.findByNameContaining(search);
    }

    public List<Professor> getProfessorsBySubject(String subject) {
        return professorRepository.findBySubject(subject);
    }
}
