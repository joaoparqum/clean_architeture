/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.estudante.main;

import com.ifba.escola.estudante.application.gateways.EstudanteGateway;
import com.ifba.escola.estudante.application.usecases.CreateEstudanteInteractor;
import com.ifba.escola.estudante.infrastructure.controllers.EstudanteDTOMapper;
import com.ifba.escola.estudante.infrastructure.gateways.EstudanteEntityMapper;
import com.ifba.escola.estudante.infrastructure.gateways.EstudanteRepositoryGateway;
import com.ifba.escola.estudante.infrastructure.persistence.EstudanteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author felip
 */
@Configuration
public class EstudanteConfig {
    
    @Bean
    CreateEstudanteInteractor createEstudante(EstudanteGateway estudanteGateway){
        return new CreateEstudanteInteractor(estudanteGateway);
    }
    
    @Bean
    EstudanteGateway estudanteGateway(EstudanteRepository estudanteRepository, EstudanteEntityMapper estudanteEntityMapper){
        return new EstudanteRepositoryGateway(estudanteRepository, estudanteEntityMapper);
    } 

    @Bean
    EstudanteEntityMapper estudanteEntityMapper(){
        return new EstudanteEntityMapper();
    }
    
    @Bean
    EstudanteDTOMapper estudanteDTOMapper(){
        return new EstudanteDTOMapper();
    }
}
