/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.estudante.infrastructure.gateways;

import com.ifba.escola.estudante.domain.entity.Estudante;
import com.ifba.escola.estudante.infrastructure.persistence.EstudanteEntity;

/**
 *
 * @author João P. Arquim
 */
public class EstudanteEntityMapper {
    
    EstudanteEntity toEntity(Estudante estudanteDomainObj) {
        return new EstudanteEntity(estudanteDomainObj.anoIngresso(), estudanteDomainObj.nome(), estudanteDomainObj.genero(), estudanteDomainObj.codigo());
    }
    
    Estudante toDomainObj(EstudanteEntity estudanteEntity){
        return new Estudante(estudanteEntity.getAnoIngresso(), estudanteEntity.getNome(), estudanteEntity.getGenero(), estudanteEntity.getCodigo());
    }
}
