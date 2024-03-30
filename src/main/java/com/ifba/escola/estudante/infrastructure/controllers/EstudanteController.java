/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.estudante.infrastructure.controllers;

import com.ifba.escola.estudante.application.usecases.CreateEstudanteInteractor;
import com.ifba.escola.estudante.domain.entity.Estudante;
import com.ifba.escola.dto.EstudanteDto;
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
@RequestMapping("Estudantes")
public class EstudanteController {
    
    private final CreateEstudanteInteractor createEstudanteInteractor;
    private final EstudanteDTOMapper estudanteDTOMapper;
    
    public EstudanteController(CreateEstudanteInteractor createEstudanteInteractor, EstudanteDTOMapper estudanteDTOMapper){
        this.createEstudanteInteractor = createEstudanteInteractor;
        this.estudanteDTOMapper = estudanteDTOMapper;
    }
    
    @PostMapping
    CreateEstudanteResponse create(@RequestBody CreateEstudanteRequest request){
        Estudante estudanteBusinessObj = estudanteDTOMapper.toEstudante(request);
        Estudante estudante = createEstudanteInteractor.createEstudante(estudanteBusinessObj);
        return estudanteDTOMapper.toResponse(estudante);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<EstudanteDto> getEstudanteById(@PathVariable Long id) {
        Estudante estudante = createEstudanteInteractor.getEstudanteById(id);
        if (estudante != null) {
            EstudanteDto estudanteDTO = estudanteDTOMapper.toDTO(estudante);
            return ResponseEntity.ok(estudanteDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstudanteDto> updateEstudante(@PathVariable Long id, @RequestBody CreateEstudanteRequest request) {
        Estudante existingEstudante = createEstudanteInteractor.getEstudanteById(id);
        if (existingEstudante != null) {
            Estudante updatedEstudante = estudanteDTOMapper.toEstudante(request);
            Estudante result = createEstudanteInteractor.updateEstudante(updatedEstudante);
            EstudanteDto resultDTO = estudanteDTOMapper.toDTO(result);
            return ResponseEntity.ok(resultDTO);
        } else {            
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstudante(@PathVariable Long id) {
        Estudante existingEstudante = createEstudanteInteractor.getEstudanteById(id);
        if (existingEstudante != null) {
            createEstudanteInteractor.deleteEstudante(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
