/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.disciplina.main;

import com.ifba.escola.disciplina.application.usecases.CreateDisciplinaInteractor;
import com.ifba.escola.disciplina.infrastructure.controllers.DisciplinaDTOMapper;
import com.ifba.escola.disciplina.infrastructure.gateways.DisciplinaEntityMapper;
import com.ifba.escola.disciplina.infrastructure.gateways.DisciplinaRepositoryGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ifba.escola.disciplina.application.gateways.DisciplinaGateway;
import com.ifba.escola.disciplina.infrastructure.persistence.DisciplinaRepository;

/**
 *
 * @author felip
 */
@Configuration
public class DisciplinaConfig {
    
    @Bean
    CreateDisciplinaInteractor createDisciplina(DisciplinaGateway disciplinaGateway){
        return new CreateDisciplinaInteractor(disciplinaGateway);
    }
    
    @Bean
    DisciplinaGateway disciplinaGateway(DisciplinaRepository disciplinaRepository, DisciplinaEntityMapper disciplinaEntityMapper){
        return new DisciplinaRepositoryGateway(disciplinaRepository, disciplinaEntityMapper);
    } 

    @Bean
    DisciplinaEntityMapper disciplinaEntityMapper(){
        return new DisciplinaEntityMapper();
    }
    
    @Bean
    DisciplinaDTOMapper disciplinaDTOMapper(){
        return new DisciplinaDTOMapper();
    }
}
