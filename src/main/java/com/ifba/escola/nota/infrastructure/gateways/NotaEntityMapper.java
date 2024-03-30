/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.nota.infrastructure.gateways;

import com.ifba.escola.nota.domain.entity.Nota;
import com.ifba.escola.nota.infrastructure.persistence.NotaEntity;

/**
 *
 * @author João P. Arquim
 */
public class NotaEntityMapper {
    
    NotaEntity toEntity(Nota notaDomainObj) {
        return new NotaEntity(notaDomainObj.codigo(), notaDomainObj.nota(), notaDomainObj.nomeEstudante(), notaDomainObj.codigoDisciplina(), notaDomainObj.codigoProfessor());
    }
    
    Nota toDomainObj(NotaEntity notaEntity){
        return new Nota (notaEntity.getCodigo(), notaEntity.getNota(), notaEntity.getNomeEstudante(), notaEntity.getCodigoDisciplina(), notaEntity.getCodigoProfessor());
    }
    
}
