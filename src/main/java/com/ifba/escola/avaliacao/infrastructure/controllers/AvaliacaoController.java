/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.avaliacao.infrastructure.controllers;

import com.ifba.escola.avaliacao.application.usecases.CreateAvaliacaoInteractor;
import com.ifba.escola.avaliacao.domain.entity.Avaliacao;
import com.ifba.escola.dto.AvaliacaoDto;    
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
 * @author Vvert
 */
@RestController
@RequestMapping("Avaliacao")
public class AvaliacaoController {
    
    public final CreateAvaliacaoInteractor createAvaliacaoInteractor;
    public final AvaliacaoDTOMapper avaliacaoDTOMapper;

    public AvaliacaoController(CreateAvaliacaoInteractor createAvaliacaoInteractor, AvaliacaoDTOMapper avaliacaoDTOMapper) {
        this.createAvaliacaoInteractor = createAvaliacaoInteractor;
        this.avaliacaoDTOMapper = avaliacaoDTOMapper;
    }
    
    @PostMapping
    CreateAvaliacaoResponse create(@RequestBody CreateAvaliacaoRequest request){
    Avaliacao avaliacaoBusinessObj = avaliacaoDTOMapper.toAvaliacao(request);
    Avaliacao avaliacao = createAvaliacaoInteractor.createAvaliacao(avaliacaoBusinessObj);
    return avaliacaoDTOMapper.toResponse(avaliacao);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AvaliacaoDto> getAvaliacaoById(@PathVariable Long id) {
        Avaliacao avaliacao = createAvaliacaoInteractor.getAvaliacaoById(id);
        if (avaliacao != null) {
            AvaliacaoDto avaliacaoDTO = avaliacaoDTOMapper.toDTO(avaliacao);
            return ResponseEntity.ok(avaliacaoDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
     @PutMapping("/{id}")
    public ResponseEntity<AvaliacaoDto> updateAvaliacao(@PathVariable Long id, @RequestBody CreateAvaliacaoRequest request) {
        Avaliacao existingAvaliacao = createAvaliacaoInteractor.getAvaliacaoById(id);
        if (existingAvaliacao != null) {
            Avaliacao updatedAvaliacao = avaliacaoDTOMapper.toAvaliacao(request);
            Avaliacao result = createAvaliacaoInteractor.updateAvaliacao(updatedAvaliacao);
            AvaliacaoDto resultDTO = avaliacaoDTOMapper.toDTO(result);
            return ResponseEntity.ok(resultDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

     @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAvaliacao(@PathVariable Long id) {
        Avaliacao existingAvaliacao = createAvaliacaoInteractor.getAvaliacaoById(id);
        if (existingAvaliacao != null) {
            createAvaliacaoInteractor.deleteAvaliacao(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
