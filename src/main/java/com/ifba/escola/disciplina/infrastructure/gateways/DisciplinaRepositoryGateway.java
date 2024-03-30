/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.escola.disciplina.infrastructure.gateways;

import com.ifba.escola.disciplina.domain.entity.Disciplina;
import com.ifba.escola.disciplina.infrastructure.persistence.DisciplinaEntity;
import java.util.Optional;
import com.ifba.escola.disciplina.application.gateways.DisciplinaGateway;
import com.ifba.escola.disciplina.infrastructure.persistence.DisciplinaRepository;

public class DisciplinaRepositoryGateway implements DisciplinaGateway{
    
    private final DisciplinaRepository disciRepository;
    private final DisciplinaEntityMapper disciplinaEntityMapper;

    public DisciplinaRepositoryGateway(DisciplinaRepository estRepository, DisciplinaEntityMapper disciplinaEntityMapper) {
        this.disciRepository = estRepository;
        this.disciplinaEntityMapper = disciplinaEntityMapper;
    }

    @Override
    public Disciplina createDisciplina(Disciplina disciplinaDomainObj) {
        DisciplinaEntity disciplinaEntity = disciplinaEntityMapper.toEntity(disciplinaDomainObj);
        DisciplinaEntity savedObj = disciRepository.save(disciplinaEntity);
        return disciplinaEntityMapper.toDomainObj(savedObj);
    }
    
    @Override
    public Disciplina getDisciplinaById(Long id) {
        Optional<DisciplinaEntity> optionalEntity = disciRepository.findById(id);
        return optionalEntity.map(disciplinaEntityMapper::toDomainObj).orElse(null);
    }

    @Override
    public Disciplina updateDisciplina(Disciplina disciplinaDomainObj) {
        DisciplinaEntity disciplinaEntity = disciplinaEntityMapper.toEntity(disciplinaDomainObj);
        DisciplinaEntity updatedObj = disciRepository.save(disciplinaEntity);
        return disciplinaEntityMapper.toDomainObj(updatedObj);
    }

    @Override
    public void deleteDisciplina(Long id) {
        disciRepository.deleteById(id);
    }
    
}
