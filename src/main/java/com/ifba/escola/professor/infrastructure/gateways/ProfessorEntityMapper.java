package com.ifba.escola.professor.infrastructure.gateways;

import com.ifba.escola.professor.domain.entity.Professor;
import com.ifba.escola.professor.infrastructure.persistence.ProfessorEntity;

/**
 *
 * @author João P. Arquim
 */
public class ProfessorEntityMapper {
    
    ProfessorEntity toEntity(Professor professorDomainObj) {
        return new ProfessorEntity(professorDomainObj.nivelAcademico(), professorDomainObj.nome(), professorDomainObj.genero(), professorDomainObj.codigo());
    }
    
    Professor toDomainObj(ProfessorEntity professorEntity){
        return new Professor(professorEntity.getNivelAcademico(), professorEntity.getNome(), professorEntity.getGenero(), professorEntity.getCodigo());
    }
}
