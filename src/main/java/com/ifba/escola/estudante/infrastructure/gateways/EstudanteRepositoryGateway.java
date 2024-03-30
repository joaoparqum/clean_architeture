/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.estudante.infrastructure.gateways;

import com.ifba.escola.estudante.application.gateways.EstudanteGateway;
import com.ifba.escola.estudante.domain.entity.Estudante;
import com.ifba.escola.estudante.infrastructure.persistence.EstudanteEntity;
import com.ifba.escola.estudante.infrastructure.persistence.EstudanteRepository;
import java.util.Optional;

public class EstudanteRepositoryGateway implements EstudanteGateway{
    
    private final EstudanteRepository estRepository;
    private final EstudanteEntityMapper estudanteEntityMapper;

    public EstudanteRepositoryGateway(EstudanteRepository estRepository, EstudanteEntityMapper estudanteEntityMapper) {
        this.estRepository = estRepository;
        this.estudanteEntityMapper = estudanteEntityMapper;
    }

    @Override
    public Estudante createEstudante(Estudante estudanteDomainObj) {
        EstudanteEntity estudanteEntity = estudanteEntityMapper.toEntity(estudanteDomainObj);
        EstudanteEntity savedObj = estRepository.save(estudanteEntity);
        return estudanteEntityMapper.toDomainObj(savedObj);
    }
    
    @Override
    public Estudante getEstudanteById(Long id) {
        Optional<EstudanteEntity> optionalEntity = estRepository.findById(id);
        return optionalEntity.map(estudanteEntityMapper::toDomainObj).orElse(null);
    }

    @Override
    public Estudante updateEstudante(Estudante estudanteDomainObj) {
        EstudanteEntity estudanteEntity = estudanteEntityMapper.toEntity(estudanteDomainObj);
        EstudanteEntity updatedObj = estRepository.save(estudanteEntity);
        return estudanteEntityMapper.toDomainObj(updatedObj);
    }

    @Override
    public void deleteEstudante(Long id) {
        estRepository.deleteById(id);
    }
    
}
