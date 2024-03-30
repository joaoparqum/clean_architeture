/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.nota.infrastructure.controllers;

import com.ifba.escola.dto.NotaDto;
import com.ifba.escola.nota.domain.entity.Nota;

/**
 *
 * @author João P. Arquim
 */
public class NotaDTOMapper {
    
    CreateNotaResponse toResponse(Nota nota){
        return new CreateNotaResponse(nota.codigo(), nota.nota(), nota.nomeEstudante(), nota.codigoDisciplina(), nota.codigoProfessor());
    }
    
    public Nota toNota(CreateNotaRequest request){
        return new Nota(request.codigo(), request.nota(), request.nomeEstudante(), request.codigoDisciplina(), request.codigoProfessor());
    }
    
    NotaDto toDTO(Nota nota){
        return new NotaDto(nota.codigo(), nota.nota(), nota.nomeEstudante(), nota.codigoDisciplina(), nota.codigoProfessor());
    }
    
}
