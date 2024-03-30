/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.disciplina.infrastructure.gateways;

import com.ifba.escola.disciplina.domain.entity.Disciplina;
import com.ifba.escola.disciplina.infrastructure.persistence.DisciplinaEntity;

/**
 *
 * @author felip
 */
public class DisciplinaEntityMapper {
    
    DisciplinaEntity toEntity(Disciplina disciplinaDomainObj) {
        return new DisciplinaEntity(disciplinaDomainObj.codigo(), disciplinaDomainObj.nomeDisciplina(), disciplinaDomainObj.horasPorSemana(), disciplinaDomainObj.creditos(), disciplinaDomainObj.codigoProfessor(), disciplinaDomainObj.nomeProfessor(), disciplinaDomainObj.nivelAcademico());
    }
    
    Disciplina toDomainObj(DisciplinaEntity disciplinaEntity){
        return new Disciplina(disciplinaEntity.getCodigo(), disciplinaEntity.getNomeDisciplina(), disciplinaEntity.getHorasPorSemana(), disciplinaEntity.getCreditos(), disciplinaEntity.getCodigoProfessor(), disciplinaEntity.getNomeProfessor(), disciplinaEntity.getNivelAcademico());
    }
}
