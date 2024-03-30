package com.ifba.escola.professor.infrastructure.controllers;

import com.ifba.escola.professor.application.usecases.CreateProfessorInteractor;
import com.ifba.escola.professor.domain.entity.Professor;
import com.ifba.escola.dto.ProfessorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Professores")
public class ProfessorController {
    
    private final CreateProfessorInteractor createProfessorInteractor;
    private final ProfessorDTOMapper professorDTOMapper;
    
    public ProfessorController(CreateProfessorInteractor createProfessorInteractor, ProfessorDTOMapper professorDTOMapper){
        this.createProfessorInteractor = createProfessorInteractor;
        this.professorDTOMapper = professorDTOMapper;
    }
    
    @PostMapping
    CreateProfessorResponse create(@RequestBody CreateProfessorRequest request){
        Professor professorBusinessObj = professorDTOMapper.toProfessor(request);
        Professor professor = createProfessorInteractor.createProfessor(professorBusinessObj);
        return professorDTOMapper.toResponse(professor);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ProfessorDto> getProfessorById(@PathVariable Long id) {
        Professor professor = createProfessorInteractor.getProfessorById(id);
        if (professor != null) {
            ProfessorDto professorDTO = professorDTOMapper.toDTO(professor);
            return ResponseEntity.ok(professorDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProfessorDto> updateProfessor(@PathVariable Long id, @RequestBody CreateProfessorRequest request) {
        Professor existingProfessor = createProfessorInteractor.getProfessorById(id);
        if (existingProfessor != null) {
            Professor updatedProfessor = professorDTOMapper.toProfessor(request);
            Professor result = createProfessorInteractor.updateProfessor(updatedProfessor);
            ProfessorDto resultDTO = professorDTOMapper.toDTO(result);
            return ResponseEntity.ok(resultDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfessor(@PathVariable Long id) {
        Professor existingProfessor = createProfessorInteractor.getProfessorById(id);
        if (existingProfessor != null) {
            createProfessorInteractor.deleteProfessor(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
