package com.example.demospringnextu.controllers;

import com.example.demospringnextu.models.Professor;
import com.example.demospringnextu.services.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/professors")
public class ProfessorController {

    private final ProfessorService professorService;

    //chopper tout les profs
    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorService.getAllProfessors();
    }
    //chopper tout les profs via leur id
    @GetMapping("/{professorId}")
    public Optional<Professor> getProfessorById(@PathVariable Integer professorId) {
        return professorService.getProfessorById(professorId);
    }
    //chopper tout les profs via leur nom
    @GetMapping("/search")
    public List<Professor> getProfessorsByNameContaining(@RequestParam String search) {
        return professorService.getProfessorsByNameContaining(search);
    }
}

