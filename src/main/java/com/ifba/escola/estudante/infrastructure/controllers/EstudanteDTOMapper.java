/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.estudante.infrastructure.controllers;

import com.ifba.escola.estudante.domain.entity.Estudante;
import com.ifba.escola.dto.EstudanteDto;

/**
 *
 * @author felip
 */
public class EstudanteDTOMapper {
     
    CreateEstudanteResponse toResponse(Estudante estudante){
        return new CreateEstudanteResponse(estudante.anoIngresso(), estudante.nome(), estudante.genero(), estudante.codigo());
    }
    
    public Estudante toEstudante(CreateEstudanteRequest request){
        return new Estudante(request.anoIngresso(), request.nome(), request.genero(), request.codigo());
    }
    
    EstudanteDto toDTO(Estudante estudante){
        return new EstudanteDto(estudante.anoIngresso(), estudante.nome(), estudante.genero(), estudante.codigo());
    }
}
