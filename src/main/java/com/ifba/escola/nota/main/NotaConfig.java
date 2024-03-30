/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.nota.main;

import com.ifba.escola.nota.application.gateways.NotaGateway;
import com.ifba.escola.nota.application.usecases.CreateNotaInteractor;
import com.ifba.escola.nota.infrastructure.controllers.NotaDTOMapper;
import com.ifba.escola.nota.infrastructure.gateways.NotaEntityMapper;
import com.ifba.escola.nota.infrastructure.gateways.NotaRepositoryGateway;
import com.ifba.escola.nota.infrastructure.persistence.NotaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author João P. Arquim
 */
@Configuration
public class NotaConfig {
    
    @Bean
    CreateNotaInteractor createNota(NotaGateway notaGateway){
        return new CreateNotaInteractor(notaGateway);
    }
    
    @Bean
    NotaGateway notaGateway(NotaRepository notaRepository, NotaEntityMapper notaEntityMapper){
        return new NotaRepositoryGateway(notaRepository, notaEntityMapper);
    } 

    @Bean
    NotaEntityMapper notaEntityMapper(){
        return new NotaEntityMapper();
    }
    
    @Bean
    NotaDTOMapper notaDTOMapper(){
        return new NotaDTOMapper();
    }
    
}
