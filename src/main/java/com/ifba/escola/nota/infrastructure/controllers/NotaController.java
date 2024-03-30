/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.nota.infrastructure.controllers;

import com.ifba.escola.dto.NotaDto;
import com.ifba.escola.nota.application.usecases.CreateNotaInteractor;
import com.ifba.escola.nota.domain.entity.Nota;
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
 * @author João P. Arquim
 */
@RestController
@RequestMapping("Notas")
public class NotaController {
    
    private final CreateNotaInteractor createNotaInteractor;
    private final NotaDTOMapper notaDTOMapper;

    public NotaController(CreateNotaInteractor createNotaInteractor, NotaDTOMapper notaDTOMapper) {
        this.createNotaInteractor = createNotaInteractor;
        this.notaDTOMapper = notaDTOMapper;
    }
    
    @PostMapping
    CreateNotaResponse createNota(@RequestBody CreateNotaRequest request){
        Nota notaBusinessObj = notaDTOMapper.toNota(request);
        Nota nota = createNotaInteractor.createNota(notaBusinessObj);
        return notaDTOMapper.toResponse(nota);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<NotaDto> getNotaById(@PathVariable Long id) {
        Nota nota = createNotaInteractor.getNotaById(id);
        if (nota != null) {
            NotaDto notaDTO = notaDTOMapper.toDTO(nota);
            return ResponseEntity.ok(notaDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<NotaDto> updateNota(@PathVariable Long id, @RequestBody CreateNotaRequest request) {
        Nota existingNota = createNotaInteractor.getNotaById(id);
        if (existingNota != null) {
            Nota updatedNota = notaDTOMapper.toNota(request);
            Nota result = createNotaInteractor.updateNota(updatedNota);
            NotaDto resultDTO = notaDTOMapper.toDTO(result);
            return ResponseEntity.ok(resultDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNota(@PathVariable Long id) {
        Nota existingNota = createNotaInteractor.getNotaById(id);
        if (existingNota != null) {
            createNotaInteractor.deleteNota(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
