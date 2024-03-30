/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.disciplina.infrastructure.controllers;

import com.ifba.escola.disciplina.domain.entity.Disciplina;
import com.ifba.escola.dto.DisciplinaDto;

/**
 *
 * @author felip
 */
public class DisciplinaDTOMapper {
     
    CreateDisciplinaResponse toResponse(Disciplina disciplina){
        return new CreateDisciplinaResponse(disciplina.codigo(), disciplina.nomeDisciplina(), disciplina.horasPorSemana(), disciplina.creditos(), disciplina.codigoProfessor(), disciplina.nomeProfessor(), disciplina.nivelAcademico());
    }
    
    public Disciplina toDisciplina(CreateDisciplinaRequest request){
        return new Disciplina(request.codigo(), request.nomeDisciplina(), request.horasPorSemana(), request.creditos(), request.codigoProfessor(), request.nomeProfessor(), request.nivelAcademico());
    }
    
    DisciplinaDto toDTO(Disciplina disciplina){
        return new DisciplinaDto(disciplina.codigo(), disciplina.nomeDisciplina(), disciplina.horasPorSemana(), disciplina.creditos(), disciplina.codigoProfessor(), disciplina.nomeProfessor(), disciplina.nivelAcademico());
    }
}