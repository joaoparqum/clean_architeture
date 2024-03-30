package com.ifba.escola.professor.infrastructure.controllers;

import com.ifba.escola.professor.domain.entity.Professor;
import com.ifba.escola.dto.ProfessorDto;

public class ProfessorDTOMapper {
     
    CreateProfessorResponse toResponse(Professor professor){
        return new CreateProfessorResponse(professor.nivelAcademico(), professor.nome(), professor.genero(), professor.codigo());
    }
    
    public Professor toProfessor(CreateProfessorRequest request){
        return new Professor(request.nivelAcademico(), request.nome(), request.genero(), request.codigo());
    }
    
    ProfessorDto toDTO(Professor professor){
        return new ProfessorDto(professor.nivelAcademico(), professor.nome(), professor.genero(), professor.codigo());
    }
}
