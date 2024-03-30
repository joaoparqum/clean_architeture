package com.ifba.escola.avaliacao.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ifba.escola.avaliacao.application.gateways.AvaliacaoGateway;
import com.ifba.escola.avaliacao.application.usecases.CreateAvaliacaoInteractor;
import com.ifba.escola.avaliacao.infrastructure.controllers.AvaliacaoDTOMapper;
import com.ifba.escola.avaliacao.infrastructure.gateways.AvaliacaoEntityMapper;
import com.ifba.escola.avaliacao.infrastructure.gateways.AvaliacaoRepositoryGateway;
import com.ifba.escola.avaliacao.infrastructure.persistence.AvaliacaoRepository;


@Configuration
public class AvaliacaoConfig {
    
    @Bean 
        CreateAvaliacaoInteractor createAvaliacao(AvaliacaoGateway avaliacaoGateway){
        return new CreateAvaliacaoInteractor(avaliacaoGateway);
        }

    @Bean
    AvaliacaoGateway avaliacaoGateway(AvaliacaoRepository avaliacaoRepository, 
    AvaliacaoEntityMapper avaliacaoEntityMapper){
        return new AvaliacaoRepositoryGateway(avaliacaoRepository, avaliacaoEntityMapper);    
    }
    
    @Bean
    AvaliacaoEntityMapper avaliacaoEntityMapper(){
        return new AvaliacaoEntityMapper();
    }
    
    @Bean
    AvaliacaoDTOMapper avaliacaoDTOMapper(){
        return new AvaliacaoDTOMapper();
    }
}
