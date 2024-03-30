package com.ifba.escola.professor.infrastructure.gateways;

import com.ifba.escola.professor.application.gateways.ProfessorGateway;
import com.ifba.escola.professor.domain.entity.Professor;
import com.ifba.escola.professor.infrastructure.persistence.ProfessorEntity;
import com.ifba.escola.professor.infrastructure.persistence.ProfessorRepository;
import java.util.Optional;

public class ProfessorRepositoryGateway implements ProfessorGateway{
    
    private final ProfessorRepository profRepository;
    private final ProfessorEntityMapper professorEntityMapper;

    public ProfessorRepositoryGateway(ProfessorRepository profRepository, ProfessorEntityMapper professorEntityMapper) {
        this.profRepository = profRepository;
        this.professorEntityMapper = professorEntityMapper;
    }

    @Override
    public Professor createProfessor(Professor professorDomainObj) {
        ProfessorEntity professorEntity = professorEntityMapper.toEntity(professorDomainObj);
        ProfessorEntity savedObj = profRepository.save(professorEntity);
        return professorEntityMapper.toDomainObj(savedObj);
    }
    
    @Override
    public Professor getProfessorById(Long id) {
        Optional<ProfessorEntity> optionalEntity = profRepository.findById(id);
        return optionalEntity.map(professorEntityMapper::toDomainObj).orElse(null);
    }

    @Override
    public Professor updateProfessor(Professor professorDomainObj) {
        ProfessorEntity professorEntity = professorEntityMapper.toEntity(professorDomainObj);
        ProfessorEntity updatedObj = profRepository.save(professorEntity);
        return professorEntityMapper.toDomainObj(updatedObj);
    }

    @Override
    public void deleteProfessor(Long id) {
        profRepository.deleteById(id);
    }
    
}
