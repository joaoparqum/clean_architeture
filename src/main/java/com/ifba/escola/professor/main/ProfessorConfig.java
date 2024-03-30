package com.ifba.escola.professor.main;

import com.ifba.escola.professor.application.gateways.ProfessorGateway;
import com.ifba.escola.professor.application.usecases.CreateProfessorInteractor;
import com.ifba.escola.professor.infrastructure.controllers.ProfessorDTOMapper;
import com.ifba.escola.professor.infrastructure.gateways.ProfessorEntityMapper;
import com.ifba.escola.professor.infrastructure.gateways.ProfessorRepositoryGateway;
import com.ifba.escola.professor.infrastructure.persistence.ProfessorRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfessorConfig {
    
    @Bean
    CreateProfessorInteractor createProfessor(ProfessorGateway professorGateway){
        return new CreateProfessorInteractor(professorGateway);
    }
    
    @Bean
    ProfessorGateway professorGateway(ProfessorRepository professorRepository, ProfessorEntityMapper professorEntityMapper){
        return new ProfessorRepositoryGateway(professorRepository, professorEntityMapper);
    } 

    @Bean
    ProfessorEntityMapper professorEntityMapper(){
        return new ProfessorEntityMapper();
    }
    
    @Bean
    ProfessorDTOMapper professorDTOMapper(){
        return new ProfessorDTOMapper();
    }
}
