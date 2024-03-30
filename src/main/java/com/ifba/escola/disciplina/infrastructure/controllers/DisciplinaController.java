/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.disciplina.infrastructure.controllers;

import com.ifba.escola.disciplina.application.usecases.CreateDisciplinaInteractor;
import com.ifba.escola.disciplina.domain.entity.Disciplina;
import com.ifba.escola.dto.DisciplinaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author felip
 */

@RestController
@RequestMapping("Disciplinas")
public class DisciplinaController {
    
    private final CreateDisciplinaInteractor createDisciplinaInteractor;
    private final DisciplinaDTOMapper disciplinaDTOMapper;
    
    public DisciplinaController(CreateDisciplinaInteractor createDisciplinaInteractor, DisciplinaDTOMapper disciplinaDTOMapper){
        this.createDisciplinaInteractor = createDisciplinaInteractor;
        this.disciplinaDTOMapper = disciplinaDTOMapper;
    }
    
    @PostMapping
    CreateDisciplinaResponse create(@RequestBody CreateDisciplinaRequest request){
        Disciplina disciplinaBusinessObj = disciplinaDTOMapper.toDisciplina(request);
        Disciplina disciplina = createDisciplinaInteractor.createDisciplina(disciplinaBusinessObj);
        return disciplinaDTOMapper.toResponse(disciplina);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<DisciplinaDto> getDisciplinaById(@PathVariable Long id) {
        Disciplina disciplina = createDisciplinaInteractor.getDisciplinaById(id);
        if (disciplina != null) {
            DisciplinaDto disciplinaDTO = disciplinaDTOMapper.toDTO(disciplina);
            return ResponseEntity.ok(disciplinaDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisciplinaDto> updateDisciplina(@PathVariable Long id, @RequestBody CreateDisciplinaRequest request) {
        Disciplina existingDisciplina = createDisciplinaInteractor.getDisciplinaById(id);
        if (existingDisciplina != null) {
            Disciplina updatedDisciplina = disciplinaDTOMapper.toDisciplina(request);
            Disciplina result = createDisciplinaInteractor.updateDisciplina(updatedDisciplina);
            DisciplinaDto resultDTO = disciplinaDTOMapper.toDTO(result);
            return ResponseEntity.ok(resultDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisciplina(@PathVariable Long id) {
        Disciplina existingDisciplina = createDisciplinaInteractor.getDisciplinaById(id);
        if (existingDisciplina != null) {
            createDisciplinaInteractor.deleteDisciplina(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
